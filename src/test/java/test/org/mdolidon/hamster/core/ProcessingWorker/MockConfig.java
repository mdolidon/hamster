package test.org.mdolidon.hamster.core.ProcessingWorker;

import java.io.File;
import java.net.URL;

import org.mdolidon.hamster.configuration.IStorageResolver;
import org.mdolidon.hamster.configuration.TreeStorageResolver;

import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;
import org.mdolidon.hamster.matchers.All;

import test.org.mdolidon.hamster.mocks.BaseMockConfig;

public class MockConfig extends BaseMockConfig {
	private String startUrlStr;
	private IStorageResolver storageResolver = new TreeStorageResolver(new All(), "storage");

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

	@Override
	public TargetProfile getTargetProfile(Link link) {
		String urlStr = link.getTargetAsString();
		if (urlStr.contains("NN")) {
			return new TargetProfile(false, false);
		} else if (urlStr.contains("YN")) {
			return new TargetProfile(true, false);
		} else if (urlStr.contains("YY")) {
			return new TargetProfile(true, true);
		} else if (urlStr.contains("NY")) {
			return new TargetProfile(false, true);
		}
		return null;
	}

	@Override
	public File getStorageFile(Link link) {
		return storageResolver.getStorageFile(link);
	}
}
