package org.springframework.social.eventbrite.api;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.io.Serializable;
import java.util.List;


/**
 *
 * @author michael
 */
public class EventbriteProfile implements Serializable {
    
    @JsonProperty
    private List<Email> emails;
    
    private static class Email {
        @JsonProperty
        private String email;
        @JsonProperty
        private boolean verified;
        @JsonProperty
        private boolean primary;
    }
    
    @JsonProperty
    private String id;
    @JsonProperty
    private String name;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;

    public String getPrimaryEmail() {
        if(this.emails != null && !this.emails.isEmpty()) {
            for(Email email : this.emails) {
                if(email.primary == true) {
                    return email.email;
                }
            }
        }
        return null;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    
}
