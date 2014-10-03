package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;

/**
 *
 * @author michael
 */
public class EventList implements Serializable {
    
    @JsonProperty
    private List<Event> events;
    
    // TODO implement pagination

    public List<Event> getEvents() {
        return events;
    }

    public void setEvents(List<Event> events) {
        this.events = events;
    }
    
}
