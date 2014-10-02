package org.springframework.social.eventbrite.connect;

import org.springframework.social.ApiException;
import org.springframework.social.connect.ApiAdapter;
import org.springframework.social.connect.ConnectionValues;
import org.springframework.social.connect.UserProfile;
import org.springframework.social.connect.UserProfileBuilder;
import org.springframework.social.eventbrite.api.Eventbrite;
import org.springframework.social.eventbrite.api.EventbriteProfile;

/**
 *
 * @author michael
 */
public class EventbriteAdapter implements ApiAdapter<Eventbrite> {

    @Override
    public boolean test(Eventbrite eventbrite) {
        try {
            eventbrite.userOperations().getUserProfile();
            return true;
        } catch(ApiException e) {
            return false;
        }
    }

    @Override
    public void setConnectionValues(Eventbrite eventbrite, ConnectionValues cv) {
        EventbriteProfile profile = eventbrite.userOperations().getUserProfile();
        cv.setDisplayName(profile.getName());
//        cv.setImageUrl(null);
//        cv.setProfileUrl(null);
        cv.setProviderUserId(profile.getId());
    }

    @Override
    public UserProfile fetchUserProfile(Eventbrite eventbrite) {
        EventbriteProfile profile = eventbrite.userOperations().getUserProfile();
        return new UserProfileBuilder().setName(profile.getName()).setEmail(profile.getPrimaryEmail()).build();
    }

    @Override
    public void updateStatus(Eventbrite a, String string) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
