package test.org.mdolidon.hamster.mocks;

import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.protocol.HttpClientContext;
import org.mdolidon.hamster.core.IConfiguration;
import org.mdolidon.hamster.core.IMatcher;
import org.mdolidon.hamster.core.Link;
import org.mdolidon.hamster.core.TargetProfile;

public class BaseMockConfig implements IConfiguration {

	private URL startUrl;

	@Override
	public boolean isValid() {
		return true;
	}

	@Override
	public String getErrorMessage() {
		return "";
	}

	@Override
	public URL getStartUrl() {
		return startUrl;
	}

	public void setStartUrl(URL url) {
		startUrl = url;
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
		return new TargetProfile(true, true);
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
		return new ArrayList<IMatcher>();
	}

	@Override
	public HttpClientContext makeHttpContext(Link link) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<HttpPost> getCheckinPostRequests() {
		// TODO Auto-generated method stub
		return null;
	}

}
