package org.springframework.social.eventbrite.api;

/**
 *
 * @author michael
 */
public interface UserOperations {
    EventbriteProfile getUserProfile();
    EventList getOwnedEvents();
}
