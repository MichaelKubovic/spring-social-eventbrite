package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.TimeZone;

//@JsonIgnoreProperties({"ticket_classes", "format", "subcategory", "category", "venue", "organizer", "start", "logo", "description", "name"})
public class Event extends Resource implements Serializable {

    @JsonProperty("ticket_classes")
    private List<Ticket> ticketClasses;
    
    public static class Time {
        @JsonProperty
        private Date local;
        @JsonProperty
        private TimeZone timezone;
        @JsonProperty
        private Date utc;

        public Date getLocal() {
            return local;
        }

        public void setLocal(Date local) {
            this.local = local;
        }

        public TimeZone getTimezone() {
            return timezone;
        }

        public void setTimezone(String timezone) {
            this.timezone = TimeZone.getTimeZone(timezone);
        }

        public Date getUtc() {
            return utc;
        }

        public void setUtc(Date utc) {
            this.utc = utc;
        }
    }
    
    @JsonProperty
    private Format format;
    
    @JsonProperty
    private Subcategory subcategory;
    
    @JsonProperty
    private Category category;
    
    @JsonProperty
    private Venue venue;
    
    @JsonProperty
    private Organizer organizer;
    
    @JsonProperty("format_id")
    private String formatId;
    
    @JsonProperty("subcategory_id")
    private String subcategoryId;
    
    @JsonProperty("category_id")
    private String categoryId;
    
    @JsonProperty("venue_id")
    private String venueId;
    
    @JsonProperty("organizer_id")
    private String organizerId;
    
    @JsonProperty("show_remaining")
    private Boolean showRemaining;
    
    @JsonProperty("online_event")
    private Boolean onlineEvent;
    
    @JsonProperty("invite_only")
    private Boolean inviteOnly;
    
    @JsonProperty
    private Time start;
    
    @JsonProperty("logo_url")
    private String logoUrl;
    
    @JsonProperty
    private String url;
    
    @JsonProperty
    private Logo logo;
    
    public static class Logo {
        @JsonProperty
        private String id;
        @JsonProperty
        private String url;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }
    
    @JsonProperty
    private FormattedText description;

    @JsonProperty
    private FormattedText name;
    
    @JsonProperty
    private Time end;
    
    @JsonProperty
    private String created;
    
    @JsonProperty
    private String changed;
    
    @JsonProperty
    private Integer capacity;
    
    @JsonProperty
    private String status;
    
    @JsonProperty
    private String currency;
    
    @JsonProperty
    private Boolean listed;
    
    @JsonProperty
    private Boolean shareable;

    public Format getFormat() {
        return format;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public Subcategory getSubcategory() {
        return subcategory;
    }

    public void setSubcategory(Subcategory subcategory) {
        this.subcategory = subcategory;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public Organizer getOrganizer() {
        return organizer;
    }

    public void setOrganizer(Organizer organizer) {
        this.organizer = organizer;
    }

    public String getFormatId() {
        return formatId;
    }

    public void setFormatId(String formatId) {
        this.formatId = formatId;
    }

    public String getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(String subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getVenueId() {
        return venueId;
    }

    public void setVenueId(String venueId) {
        this.venueId = venueId;
    }

    public String getOrganizerId() {
        return organizerId;
    }

    public void setOrganizerId(String organizerId) {
        this.organizerId = organizerId;
    }

    public Boolean getShowRemaining() {
        return showRemaining;
    }

    public void setShowRemaining(Boolean showRemaining) {
        this.showRemaining = showRemaining;
    }

    public Boolean getOnlineEvent() {
        return onlineEvent;
    }

    public void setOnlineEvent(Boolean onlineEvent) {
        this.onlineEvent = onlineEvent;
    }

    public Boolean getInviteOnly() {
        return inviteOnly;
    }

    public void setInviteOnly(Boolean inviteOnly) {
        this.inviteOnly = inviteOnly;
    }

    public Time getStart() {
        return start;
    }

    public void setStart(Time start) {
        this.start = start;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public FormattedText getDescription() {
        return description;
    }

    public void setDescription(FormattedText description) {
        this.description = description;
    }

    public FormattedText getName() {
        return name;
    }

    public void setName(FormattedText name) {
        this.name = name;
    }

    public Time getEnd() {
        return end;
    }

    public void setEnd(Time end) {
        this.end = end;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getChanged() {
        return changed;
    }

    public void setChanged(String changed) {
        this.changed = changed;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Boolean getListed() {
        return listed;
    }

    public void setListed(Boolean listed) {
        this.listed = listed;
    }

    public Boolean getShareable() {
        return shareable;
    }

    public void setShareable(Boolean shareable) {
        this.shareable = shareable;
    }
    
    
}
