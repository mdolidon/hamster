package test.org.mdolidon.hamster.storageResolvers;

import java.net.URL;

import test.org.mdolidon.hamster.mocks.BaseConfigMock;

public class Config extends BaseConfigMock {
	private String startUrlStr; 

	public Config(String startUrlStr) {
		this.startUrlStr = startUrlStr;
	}

	@Override
	public URL getStartUrl() {
		try {
			return new URL(startUrlStr);
		} catch (Exception e) {
			return null;
		}
	}

	@Override
	public String getStartUrlAsString() {
		return startUrlStr;
	}

}
