package org.springframework.social.eventbrite.api;

import java.io.Serializable;
import java.util.List;

/**
 *
 * @author michael
 */
public class EventbriteProfile implements Serializable {
    
    private List<EventbriteProfileEmail> emails;
    
    public class EventbriteProfileEmail {
        private String email;
        private boolean verified;
        private boolean primary;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public boolean isVerified() {
            return verified;
        }

        public void setVerified(boolean verified) {
            this.verified = verified;
        }

        public boolean isPrimary() {
            return primary;
        }

        public void setPrimary(boolean primary) {
            this.primary = primary;
        }
    }
    
    private String id;
    private String name;
    private String firstName;
    private String lastName;

    public List<EventbriteProfileEmail> getEmails() {
        return emails;
    }

    public void setEmails(List<EventbriteProfileEmail> emails) {
        this.emails = emails;
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
