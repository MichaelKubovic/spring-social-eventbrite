package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author michael
 */
public class FormattedText {
    @JsonProperty
    private String html;
    @JsonProperty
    private String text;

    public String getHtml() {
        return html;
    }

    public void setHtml(String html) {
        this.html = html;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}
