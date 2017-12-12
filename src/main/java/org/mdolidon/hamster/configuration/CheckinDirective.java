package org.mdolidon.hamster.configuration;

import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CheckinDirective {

	private static Logger logger = LogManager.getLogger();

	private URL target;
	private Map<String, String> postParameters = new HashMap<>();

	public void setUrl(String url) throws MalformedURLException {
		target = new URL(url);
	}

	public void addPostParameter(String name, String value) {
		postParameters.put(name, name);
	}

	public URL getTarget() {
		return target;
	}

	public HttpPost getPostRequest() {
		HttpPost httpPost;
		try {
			httpPost = new HttpPost(target.toURI());
		} catch (URISyntaxException e) {
			logger.error("Bad URI syntax for check-in request : {}", target);
			return null;
		}
		List<NameValuePair> params = new ArrayList<NameValuePair>();
		for (Map.Entry<String, String> entry : postParameters.entrySet()) {
			params.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
		}
		try {
			httpPost.setEntity(new UrlEncodedFormEntity(params));
		} catch (UnsupportedEncodingException e) {
			logger.error("Unsupported encoding in POST parameters for a check-in request : {}", target);
			return null;
		}
		return httpPost;
	}

}
