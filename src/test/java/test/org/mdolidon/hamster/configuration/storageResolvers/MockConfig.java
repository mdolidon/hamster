package test.org.mdolidon.hamster.configuration.storageResolvers;

import java.net.URL;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class MockConfig extends BaseMockConfig {
	private String startUrlStr; 

	public MockConfig(String startUrlStr) {
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
