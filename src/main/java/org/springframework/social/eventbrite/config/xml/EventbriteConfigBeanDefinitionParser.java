package org.springframework.social.eventbrite.config.xml;

import org.springframework.social.config.xml.AbstractProviderConfigBeanDefinitionParser;
import org.springframework.social.eventbrite.config.support.EventbriteApiHelper;
import org.springframework.social.eventbrite.connect.EventbriteConnectionFactory;

/**
 *
 * @author michael
 */
public class EventbriteConfigBeanDefinitionParser extends AbstractProviderConfigBeanDefinitionParser {

    public EventbriteConfigBeanDefinitionParser() {
        super(EventbriteConnectionFactory.class, EventbriteApiHelper.class);
    }
}
