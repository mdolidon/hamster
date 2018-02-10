package org.mdolidon.hamster.configuration;

import java.util.Map;

import org.apache.http.client.CookieStore;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.cookie.BasicClientCookie;

public class CookiesDirective {

	private Map<String, String> namesAndValues;

	// as passed to the cookie API
	private String domain;
	private String path;

	public CookiesDirective(Map<String, String> namesAndValues, String domainAndPath) {
		this.namesAndValues = namesAndValues;

		String[] splitDomainPath = domainAndPath.split("/", 2);
		domain = splitDomainPath[0];
		if (splitDomainPath.length == 2) {
			path = splitDomainPath[1];
		} else {
			path = "";
		}
	}

	public void addCookiesToClientContext(HttpClientContext ctx) {
		CookieStore store = ctx.getCookieStore();
		if (store == null) {
			store = new BasicCookieStore();
			ctx.setCookieStore(store);
		}

		for (String name : namesAndValues.keySet()) {
			BasicClientCookie ck = new BasicClientCookie(name, namesAndValues.get(name));
			ck.setDomain(domain);
			ck.setPath(path);
			store.addCookie(ck);
		}
	}
	
	
	// This is a testing hook
	public String getValue(String name) {
		return namesAndValues.get(name);
	}
}
