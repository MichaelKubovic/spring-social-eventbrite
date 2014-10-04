package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author michael
 */
public abstract class Resource {
    @JsonProperty
    private String id;
    @JsonProperty("resource_uri")
    private String resourceUri;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getResourceUri() {
        return resourceUri;
    }

    public void setResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
    }

}
