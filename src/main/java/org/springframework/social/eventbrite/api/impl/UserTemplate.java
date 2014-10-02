/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.springframework.social.eventbrite.api.impl;

import org.springframework.social.eventbrite.api.EventbriteProfile;
import org.springframework.social.eventbrite.api.UserOperations;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author michael
 */
public class UserTemplate extends AbstractEventbriteOperations implements UserOperations {
    
    private final RestTemplate restTemplate;

    public UserTemplate(RestTemplate restTemplate, boolean authorized) {
        super(authorized);
        this.restTemplate = restTemplate;
    }

    @Override
    public EventbriteProfile getUserProfile() {
        return restTemplate.getForObject(buildUri("users/me/"), EventbriteProfile.class);
    }
    
}
