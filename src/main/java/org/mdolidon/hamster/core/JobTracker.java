package org.mdolidon.hamster.core;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Semaphore;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JobTracker<E extends IMementoElement> {
	
	private static Logger logger = LogManager.getLogger();

	private Semaphore pauseSemaphore;
	private int capacity;

	private Deque<E> toDo;
	private Set<E> beingDone = ConcurrentHashMap.newKeySet(20);

	public JobTracker(Semaphore pauseSemaphore, int capacity) {
		this.pauseSemaphore = pauseSemaphore;
		this.capacity = capacity;
		toDo = new ArrayDeque<E>(capacity);
	}

	public int remainingCapacity() {
		return capacity - toDo.size();
	}

	public int count() {
		return toDo.size() + beingDone.size();
	}

	/**
	 * Adds all the elements from the collection. Returns true if the queue was
	 * changed as a result. Just like .put, this method does check the semaphore
	 * before proceeding, and will not fill the queue beyond its maxCapacity.
	 * 
	 * @param c
	 * @return
	 */
	public boolean addAll(Collection<? extends E> c) throws InterruptedException {
		boolean result;
		while (true) {
			pauseSemaphore.acquire();
			synchronized (toDo) {
				if (toDo.size() + c.size() < capacity) {
					result = toDo.addAll(c);
					pauseSemaphore.release();
					toDo.notify();
					return result;
				}
				pauseSemaphore.release();
				while (toDo.size() + c.size() >= capacity) {
					toDo.wait();
				}
			}
		}
	}

	/**
	 * Will put e into the queue if the semaphore can be acquired. If there's no
	 * room left in the queue, the semaphore will be released and the thread will
	 * block until some other thread takes an element first. The semaphore will be
	 * reacquired before actually changing the queue's contents.
	 * 
	 * @param e
	 * @throws InterruptedException
	 */
	public void put(E e) throws InterruptedException {
		while (true) {
			pauseSemaphore.acquire();
			synchronized (toDo) {
				if (toDo.size() < capacity) {
					toDo.addLast(e);
					pauseSemaphore.release();
					toDo.notify();
					return;
				}
				pauseSemaphore.release();
				while (toDo.size() >= capacity) {
					toDo.wait();
				}
			}
		}
	}

	/**
	 * Returns the next element in the queue, if the semaphore can be acquired. If
	 * the queue is empty, the semaphore will be released and the thread will block.
	 * When an element becomes available, the semaphore will be reacquired before
	 * actually taking the element.
	 * 
	 * @return
	 * @throws InterruptedException
	 */
	public E takeAndTrack() throws InterruptedException {
		E retVal;
		while (true) {
			pauseSemaphore.acquire();
			synchronized (toDo) {
				if (!toDo.isEmpty()) {
					retVal = toDo.removeFirst();
					beingDone.add(retVal);
					pauseSemaphore.release();
					toDo.notify(); // wake up the next consumer !
					return retVal;
				}
				pauseSemaphore.release(); // that's the important bit : allow the queue to be serialized
											// even though we're waiting at its tail end
				while (toDo.isEmpty()) {
					toDo.wait();
				}
			}
		}
	}

	public void forget(E job) throws InterruptedException {
		pauseSemaphore.acquire();
		beingDone.remove(job);
		pauseSemaphore.release();
	}

	
	@SuppressWarnings("unchecked")
	public List<E> copyAllInNewList() {
		List<E> list = new ArrayList<>(beingDone.size() + toDo.size());
		try {
			for (E element : beingDone) {
				list.add((E) element.cryogenize());
			}
			for (E element : toDo) {
				list.add((E) element.cryogenize());
			}
		} catch (Exception e) {
			logger.error("Exception thrown while attempting to copy job tracker's state : {}", e);
		}
		return list;
	}

}
