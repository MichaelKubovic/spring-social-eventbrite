package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Ticket extends Resource {

    @JsonProperty("event_id")
    private String eventId;
    
    @JsonProperty
    private String name;
    
    @JsonProperty("maximum_quantity")
    private Integer maximumQuantity;
    
    @JsonProperty("minimum_quantity")
    private Integer minimumQuantity;
    
    @JsonProperty
    private Boolean free;
    
    @JsonProperty
    private Boolean donation;
    
    @JsonProperty
    private String description;
    
    @JsonProperty("quantity_total")
    private Integer quantityTotal;
    
    @JsonProperty("quantity_sold")
    private Integer quantitySold;
    
    @JsonProperty("sales_end")
    private String salesEnd;
    
    @JsonProperty
    private Boolean hidden;
    
    @JsonProperty("include_fee")
    private Boolean includeFee;
    
    @JsonProperty("split_fee")
    private Boolean splitFee;
    
    @JsonProperty("hide_description")
    private Boolean hideDescription;
    
    @JsonProperty("auto_hide")
    private Boolean autoHide;

    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getMaximumQuantity() {
        return maximumQuantity;
    }

    public void setMaximumQuantity(Integer maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public Integer getMinimumQuantity() {
        return minimumQuantity;
    }

    public void setMinimumQuantity(Integer minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public Boolean getFree() {
        return free;
    }

    public void setFree(Boolean free) {
        this.free = free;
    }

    public Boolean getDonation() {
        return donation;
    }

    public void setDonation(Boolean donation) {
        this.donation = donation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantityTotal() {
        return quantityTotal;
    }

    public void setQuantityTotal(Integer quantityTotal) {
        this.quantityTotal = quantityTotal;
    }

    public Integer getQuantitySold() {
        return quantitySold;
    }

    public void setQuantitySold(Integer quantitySold) {
        this.quantitySold = quantitySold;
    }

    public String getSalesEnd() {
        return salesEnd;
    }

    public void setSalesEnd(String salesEnd) {
        this.salesEnd = salesEnd;
    }

    public Boolean getHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public Boolean getIncludeFee() {
        return includeFee;
    }

    public void setIncludeFee(Boolean includeFee) {
        this.includeFee = includeFee;
    }

    public Boolean getSplitFee() {
        return splitFee;
    }

    public void setSplitFee(Boolean splitFee) {
        this.splitFee = splitFee;
    }

    public Boolean getHideDescription() {
        return hideDescription;
    }

    public void setHideDescription(Boolean hideDescription) {
        this.hideDescription = hideDescription;
    }

    public Boolean getAutoHide() {
        return autoHide;
    }

    public void setAutoHide(Boolean autoHide) {
        this.autoHide = autoHide;
    }

    
}
