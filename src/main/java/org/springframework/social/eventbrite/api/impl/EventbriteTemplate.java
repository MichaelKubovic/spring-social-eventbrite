package org.springframework.social.eventbrite.api.impl;

import static com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL;
import static com.fasterxml.jackson.databind.DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES;
import com.fasterxml.jackson.databind.ObjectMapper;
import static com.fasterxml.jackson.databind.SerializationFeature.FAIL_ON_EMPTY_BEANS;
import static com.fasterxml.jackson.databind.SerializationFeature.WRITE_DATES_AS_TIMESTAMPS;
import java.util.ArrayList;
import java.util.List;
import org.springframework.http.converter.ByteArrayHttpMessageConverter;
import org.springframework.http.converter.FormHttpMessageConverter;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.ResourceHttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.social.eventbrite.api.EventOperations;
import org.springframework.social.eventbrite.api.Eventbrite;
import org.springframework.social.eventbrite.api.UserOperations;
import org.springframework.social.oauth2.AbstractOAuth2ApiBinding;
import org.springframework.social.support.ClientHttpRequestFactorySelector;
import org.springframework.web.client.RestTemplate;






public class EventbriteTemplate extends AbstractOAuth2ApiBinding implements Eventbrite {

	private EventOperations eventOperations;
	private UserOperations userOperations;

	public EventbriteTemplate(String accessToken) {
		super(accessToken);
		initialize();
		
	}

	@Override
	public EventOperations eventOperations() {
		return this.eventOperations;
	}
        
        @Override
        public UserOperations userOperations() {
            return this.userOperations;
        }
	
	// private helpers
	private void initialize() {
		// Wrap the request factory with a BufferingClientHttpRequestFactory so that the error handler can do repeat reads on the response.getBody()
		super.setRequestFactory(ClientHttpRequestFactorySelector.bufferRequests(getRestTemplate().getRequestFactory()));
		initSubApis();
	}
	
	private void initSubApis() {
		this.eventOperations = new EventTemplate(super.getRestTemplate(), isAuthorized());
                this.userOperations = new UserTemplate(super.getRestTemplate(), isAuthorized());

	}
	
	@Override
	protected void configureRestTemplate(RestTemplate restTemplate) {
		restTemplate.setErrorHandler(new EventbriteErrorHandler());
	}
	
	@Override
	protected List<HttpMessageConverter<?>> getMessageConverters() {
		
		MappingJackson2HttpMessageConverter jsonConverter = new MappingJackson2HttpMessageConverter();
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.configure(FAIL_ON_UNKNOWN_PROPERTIES, false);
		objectMapper.configure(WRITE_DATES_AS_TIMESTAMPS, false);
		objectMapper.configure(FAIL_ON_EMPTY_BEANS, false);
		objectMapper.setSerializationInclusion(NON_NULL);
		jsonConverter.setObjectMapper(objectMapper);
		
		FormHttpMessageConverter formHttpMessageConverter = new FormHttpMessageConverter();
		formHttpMessageConverter.addPartConverter(jsonConverter);
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		messageConverters.add(jsonConverter);
		messageConverters.add(new ByteArrayHttpMessageConverter());
		messageConverters.add(formHttpMessageConverter);
		messageConverters.add(new ResourceHttpMessageConverter());
		return messageConverters;
	}
}
