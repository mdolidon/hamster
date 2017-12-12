package org.mdolidon.hamster.CLI;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.apache.commons.io.IOUtils;

public class Help {

	public static void show(CommandLine commandLine) {
		if (commandLine.isInit()) {
			showTopic("init");
		} else if (commandLine.isResume()) {
			showTopic("resume");
		} else if (commandLine.isConfigurationTopicAsked()) {
			showTopic("configure");
		} else {
			showTopic("main");
		}
	}

	public static void showTopic(String topic) {
		String resourceName = "/cli_help_" + topic + ".txt";

		try {
			String text = IOUtils.resourceToString(resourceName, StandardCharsets.UTF_8);
			System.out.println(text);
		} catch (IOException e) {
			System.out.println("Sorry, the help topic '" + topic + "' could not be found.\nThis looks like a bug.");
		}
	}

}
