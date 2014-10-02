package org.springframework.social.eventbrite.api.impl;


import java.net.URI;
import java.util.Collections;
import java.util.Map;
import org.springframework.social.MissingAuthorizationException;
import org.springframework.social.support.URIBuilder;


public abstract class AbstractEventbriteOperations {
	
	private final boolean authorized;

	public AbstractEventbriteOperations(boolean authorized) {
		super();
		this.authorized = authorized;
	}

	protected void requireUserAuthorization() {
		if(!authorized) {
			throw new MissingAuthorizationException("eventbrite");
		}
	}
	
	protected URI buildUri(String path) {
		return buildUri(path, Collections.<String, String>emptyMap());
	}
	
	protected URI buildUri(String path, Map<String, String> params) {
		URIBuilder uriBuilder = URIBuilder.fromUri(API_URL_BASE + path);

		for (String paramName : params.keySet()) {
			uriBuilder.queryParam(paramName, String.valueOf(params.get(paramName)));
		}
		URI uri = uriBuilder.build();
		return uri;
	}
//	
//	protected void mput(Map<String, String> m, String k, String value) {
//		if (value != null)
//			m.put(k, value);
//	}
//	protected void mput(Map<String, String> m, String k, Collection<String> value) {
//		if (value != null &&  ! value.isEmpty())
//			m.put(k, StringUtils.collectionToCommaDelimitedString(value));
//	}
//	
//	protected void mput(Map<String, String> m, String k, ParameterEnum value) {
//		if (value != null)
//			m.put(k, value.getParameterName());
//	}
//
//	protected void mput(Map<String, String> m, String k, Number value) {
//		mputDefault(m, k, value);
//	}
//	
//	protected void mput(Map<String, String> m, String k, Boolean value) {
//		mputDefault(m, k, value);
//	}
//	
//	protected void mputDefault(Map<String, String> m, String k, Object value) {
//		if (value != null)
//			m.put(k, value.toString());
//	}
//	
	private static final String API_URL_BASE = "https://www.eventbriteapi.com/v3/";

}
