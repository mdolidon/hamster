package test.org.mdolidon.hamster.core.Mediator;

import java.net.MalformedURLException;
import java.net.URL;

import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMediator;
import org.mdolidon.hamster.core.Link;

public class Stuffer implements Runnable {

	private IMediator mediator;
	private IConfiguration cfg;
	private int counter = 0;

	private long latestStuffTimeMillis;

	public Stuffer(IConfiguration cfg, IMediator mediator) {
		this.mediator = mediator;
		this.cfg = cfg;
	}

	public void run() {
		try {
			for (;;) {
				counter++;
				Link l = new Link(new URL("http://place.com/" + counter), 1, cfg);
				mediator.acceptNewLink(l);
				synchronized (this) {
					latestStuffTimeMillis = System.currentTimeMillis();
				}
				Thread.sleep(1); // don't stuff too quickly
			}
		} catch (MalformedURLException e) {
			throw new RuntimeException(
					"The stuffer tried to create a malformed URL. Check Stuffer.java in the mediator's tests.");

		} catch (InterruptedException e) {
		}
	}
	
	public synchronized long getLatestStuffTimeMillis() {
		return latestStuffTimeMillis;
	}

}
