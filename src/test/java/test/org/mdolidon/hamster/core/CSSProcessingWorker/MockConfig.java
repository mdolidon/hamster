package test.org.mdolidon.hamster.core.CSSProcessingWorker;

import java.io.File;
import java.lang.reflect.Method;
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
	private Object delegateForTargetProfile;

	public MockConfig(String startUrlStr) {
		this.startUrlStr = startUrlStr;
	}

	public void setDelegateForTargetProfile(Object delegate) {
		delegateForTargetProfile = delegate;
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
		if (delegateForTargetProfile != null) {
			Class<? extends Object> delegateClass = delegateForTargetProfile.getClass();
			try {
				Method delegateMethod = delegateClass.getMethod("getTargetProfile", Link.class);
				return (TargetProfile) (delegateMethod.invoke(delegateForTargetProfile, link));
			} catch (Exception e) {
			}
		}

		return super.getTargetProfile(link);
	}

	@Override
	public File getStorageFile(Link link) {
		return storageResolver.getStorageFile(link);
	}
}
