package test.org.mdolidon.hamster.mocks;

import java.io.File;
import java.net.URL;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

public class BaseMockConfig implements IConfiguration {

	@Override
	public boolean isValid() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getErrorMessage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public URL getStartUrl() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getStartUrlAsString() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void correctStartUrl(URL url) {
		// TODO Auto-generated method stub

	}

	@Override
	public int getMaxConcurrentRequests() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public TargetProfile getTargetProfile(Link link) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public File getStorageFile(Link link) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getMaxContentSize(Link link) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<IMatcher> listAuthContextMatchers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void initHttpContextAuthProvider(HttpClientContext context, Link link) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<HttpPost> getCheckinPostRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
