package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author michael
 */
public class Category extends Resource {
    
    @JsonProperty
    private String name;

    @JsonProperty("short_name")
    private String shortName;
    
    @JsonProperty("name_localized")
    private String nameLocalized;

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

    public String getNameLocalized() {
        return nameLocalized;
    }

    public void setNameLocalized(String nameLocalized) {
        this.nameLocalized = nameLocalized;
    }
}
