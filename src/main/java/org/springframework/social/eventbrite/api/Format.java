package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author michael
 */
public class Format extends Resource {
    
    @JsonProperty
    private String name;
    
    @JsonProperty("short_name")
    private String shortName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

}
