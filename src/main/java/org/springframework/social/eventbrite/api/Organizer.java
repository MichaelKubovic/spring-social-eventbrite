package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Organizer extends Resource {

    @JsonProperty
    private String name;

    @JsonProperty("num_future_events")
    private Integer numFutureEvents;

    @JsonProperty("num_past_events")
    private Integer numPostEvents;

    @JsonProperty
    private FormattedText description;
    @JsonProperty
    private String url;
    @JsonProperty
    private String logo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getNumFutureEvents() {
        return numFutureEvents;
    }

    public void setNumFutureEvents(Integer numFutureEvents) {
        this.numFutureEvents = numFutureEvents;
    }

    public Integer getNumPostEvents() {
        return numPostEvents;
    }

    public void setNumPostEvents(Integer numPostEvents) {
        this.numPostEvents = numPostEvents;
    }

    public FormattedText getDescription() {
        return description;
    }

    public void setDescription(FormattedText description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

}
