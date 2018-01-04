package org.mdolidon.hamster.CLI;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.Mediator;
import org.mdolidon.hamster.core.Utils;

public class RetryInfoTask extends AbstractTask {

	public RetryInfoTask() {
		loadConfiguration();
		mediator = new Mediator(configuration);

		try {
			Serializable memento = Utils.loadSerializedObject(Utils.FINAL_MEMENTO_FILE,
					"\nIt seems that nothing needs to be retried.\n");
			mediator.resetFromMemento(memento);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			return;
		}

		List<Link> retriableLinks = mediator.getRetriableLinks();

		if (retriableLinks.isEmpty()) {
			System.out.println("It seems that nothing needs to be retried.");
			return;
		}

		Map<String, Integer> countByDomain = new HashMap<>();
		for (Link l : retriableLinks) {
			String domain = l.getTargetDomain();
			if (countByDomain.containsKey(domain)) {
				Integer count = countByDomain.get(domain);
				count = new Integer(count.intValue() + 1);
				countByDomain.put(domain, count);
			} else {
				countByDomain.put(domain, new Integer(1));
			}
		}
		System.out.println("\nThe following failed downloads could be worth retrying :");
		for (String domain : countByDomain.keySet()) {
			System.out.println("- " + countByDomain.get(domain) + " on " + domain);
		}
		System.out.println("");
	}
}
