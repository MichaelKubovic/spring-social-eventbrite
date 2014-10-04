package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author michael
 */
public class Subcategory extends Resource {
    @JsonProperty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
