package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.TimeZone;

public class Event {

    @JsonProperty
    private Integer capacity;
//    private List<String> categories;
    @JsonProperty
    private Date changed;
    @JsonProperty
    private Date created;
    @JsonProperty
    private FormattedText description;
    @JsonProperty
    private Time end;
    @JsonProperty
    private String id;
    @JsonProperty
    private FormattedText name;
    @JsonProperty
    private Organizer organizer;
    @JsonProperty
    private String resource_uri;
    @JsonProperty
    private Time start;
    @JsonProperty
    private String status;
//    private List<Ticket> ticket_classes;
    @JsonProperty
    private TimeZone timezone;
    @JsonProperty
    private String url;
//    private Venue venue;

    private static class FormattedText {
        @JsonProperty
        private String html;
        @JsonProperty
        private String text;
    }
    
    private static class Time {
        @JsonProperty
        private Date local;
        @JsonProperty
        private TimeZone timezone;
        @JsonProperty
        private Date utc;
    }
}
