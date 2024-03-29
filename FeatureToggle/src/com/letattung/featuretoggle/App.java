/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/feature-toggle
 */
package com.letattung.featuretoggle;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.featuretoggle.pattern.Service;
import com.letattung.featuretoggle.pattern.propertiesversion.PropertiesFeatureToggleVersion;
import com.letattung.featuretoggle.user.User;
import com.letattung.featuretoggle.user.UserGroup;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		final Properties properties = new Properties();
		properties.put("enhancedWelcome", true);
		Service service = new PropertiesFeatureToggleVersion(properties);
		final String welcomeMessage = service.getWelcomeMessage(new User("Le Tat Tung"));
		LOGGER.info(welcomeMessage);
		
		final Properties turnedOff = new Properties();
		turnedOff.put("enhancedWelcome", false);
		Service turnedOffService = new PropertiesFeatureToggleVersion(turnedOff);
		final String welcomMessageTurnedOff = turnedOffService.getWelcomeMessage(new User("Le Tat Tung"));
		LOGGER.info(welcomMessageTurnedOff);
		
		final User paidUser = new User("Nguyen Huu Tien");
		final User freeUser = new User("Tran Minh Hai");
		
		UserGroup.addUserToPaidGroup(paidUser);
		UserGroup.addUserToFreeGroup(freeUser);
		
		final String welcomeMessagePaidUser = service.getWelcomeMessage(paidUser);
		final String welcomeMessageFreeUser = service.getWelcomeMessage(freeUser);
		LOGGER.info(welcomeMessagePaidUser);
		LOGGER.info(welcomeMessageFreeUser);
	}
}
