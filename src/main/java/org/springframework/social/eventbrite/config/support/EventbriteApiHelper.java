package org.springframework.social.eventbrite.config.support;

import org.springframework.social.UserIdSource;
import org.springframework.social.config.xml.ApiHelper;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.eventbrite.api.Eventbrite;

/**
 *
 * @author michael
 */
public class EventbriteApiHelper implements ApiHelper<Eventbrite> {
    private final UsersConnectionRepository usersConnectionRepository;
    private final UserIdSource userIdSource;
    
    public EventbriteApiHelper(UsersConnectionRepository usersConnectionRepository, UserIdSource userIdSource) {
        this.usersConnectionRepository = usersConnectionRepository;
        this.userIdSource = userIdSource; 
    }

    @Override
    public Eventbrite getApi() {
        Connection<Eventbrite> connection = usersConnectionRepository.createConnectionRepository(userIdSource.getUserId()).findPrimaryConnection(Eventbrite.class);
        return connection != null ? connection.getApi() : null;
    }
    
}
