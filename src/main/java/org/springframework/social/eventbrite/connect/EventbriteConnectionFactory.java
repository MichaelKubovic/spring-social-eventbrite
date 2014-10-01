package org.springframework.social.eventbrite.connect;

import org.springframework.social.connect.support.OAuth2ConnectionFactory;
import org.springframework.social.eventbrite.api.Eventbrite;

/**
 *
 * @author michael
 */
public class EventbriteConnectionFactory extends OAuth2ConnectionFactory<Eventbrite> {
    
    public EventbriteConnectionFactory(String clientId, String clientSecret) {
//        this(clientId, clientSecret, null);
        super("eventbrite", new EventbriteServiceProvider(clientId, clientSecret), new EventbriteAdapter());
    }
    
//    public EventbriteConnectionFactory(String clientId, String clientServer, )
    
}
