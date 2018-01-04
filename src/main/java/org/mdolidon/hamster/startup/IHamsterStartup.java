package org.mdolidon.hamster.startup;

import org.mdolidon.hamster.core.IMediator;

public interface IHamsterStartup extends Runnable {

	public IMediator getMediator();

	public boolean hasErrors();

	public String getErrorMessage();

}
