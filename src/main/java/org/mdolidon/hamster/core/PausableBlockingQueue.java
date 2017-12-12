package org.mdolidon.hamster.core;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.Semaphore;

/**
 * A very partial implementation of the BlockingQueue API, that is linked to a
 * semaphore. Elements are added or removed only if the semaphore can be
 * acquired. Otherwise, blocking operations wait for the semaphore to be
 * available again. The intent is for an external component to be able to
 * completely pause several of these queues at once by grabbing all of the
 * semaphore's permits, and make a reliable and consistent snapshot of all of
 * their contents.
 */
public class PausableBlockingQueue<E> implements Iterable<E> {

	private Semaphore pauseSemaphore;
	private int maxCapacity;
	private Deque<E> queue;

	public PausableBlockingQueue(Semaphore pauseSemaphore, int initialCapacity, int maxCapacity) {
		this.pauseSemaphore = pauseSemaphore;
		this.maxCapacity = maxCapacity;
		queue = new ArrayDeque<E>(initialCapacity);
	}

	public boolean isEmpty() {
		return queue.isEmpty();
	}

	public int size() {
		return queue.size();
	}

	public int remainingCapacity() {
		return maxCapacity - size();
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
			synchronized (queue) {
				if (queue.size() + c.size() < maxCapacity) {
					result = queue.addAll(c);
					pauseSemaphore.release();
					queue.notify();
					return result;
				}
				pauseSemaphore.release();
				while (queue.size() + c.size() >= maxCapacity) {
					queue.wait();
				}
			}
		}
	}

	/**
	 * See Collection.iterator(). This method DOES NOT check the semaphore before
	 * proceeding.
	 */
	public Iterator<E> iterator() {
		synchronized (queue) {
			return queue.iterator();
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
			synchronized (queue) {
				if (queue.size() < maxCapacity) {
					queue.addLast(e);
					pauseSemaphore.release();
					queue.notify();
					return;
				}
				pauseSemaphore.release();
				while (queue.size() >= maxCapacity) {
					queue.wait();
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
	public E take() throws InterruptedException {
		E retVal;
		while (true) {
			pauseSemaphore.acquire();
			synchronized (queue) {
				if (!queue.isEmpty()) {
					retVal = queue.removeFirst();
					pauseSemaphore.release();
					queue.notify(); // wake up the next consumer !
					return retVal;
				}
				pauseSemaphore.release(); // that's the important bit : allow the queue to be serialized
											// even though we're waiting at its tail end
				while (queue.isEmpty()) {
					queue.wait();
				}
			}
		}
	}

}
