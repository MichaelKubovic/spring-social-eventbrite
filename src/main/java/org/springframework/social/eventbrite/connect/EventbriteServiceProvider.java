/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.eventbrite.connect;

import org.springframework.social.eventbrite.api.Eventbrite;
import org.springframework.social.eventbrite.api.impl.EventbriteTemplate;
import org.springframework.social.oauth2.AbstractOAuth2ServiceProvider;
import org.springframework.social.oauth2.OAuth2Template;

/**
 *
 * @author michael
 */
public class EventbriteServiceProvider extends AbstractOAuth2ServiceProvider<Eventbrite> {
    
    public EventbriteServiceProvider(String clientId, String clientSecret) {
        super(new OAuth2Template(clientId, clientSecret, 
                "https://www.eventbrite.com/oauth/authorize", 
                "https://www.eventbrite.com/oauth/token"));
    }
    
    public Eventbrite getApi(String accessToken) {
        return new EventbriteTemplate(accessToken);
    }
}
