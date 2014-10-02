package org.springframework.social.eventbrite.api;

import org.springframework.social.ApiBinding;


public interface Eventbrite extends ApiBinding {
	public EventOperations eventOperations();
        public UserOperations userOperations();
}
