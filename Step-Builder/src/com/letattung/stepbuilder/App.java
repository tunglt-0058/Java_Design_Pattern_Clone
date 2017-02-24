/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/step-builder
 */
package com.letattung.stepbuilder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		Character warrior = CharacterStepBuilder.newBuilder().name("Le Tat Tung")
				.fighterClass("Paladin").withWeapon("Sword").noAbilities().build();
		LOGGER.info(warrior.toString());
		
		Character mage = CharacterStepBuilder.newBuilder().name("Nguyen Huu Tien").wizardClass("Sorcerer")
				.withSpell("Fireball").withAbility("Fire Aura").withAbility("Teleport").noMoreAbilities().build();
		LOGGER.info(mage.toString());

		Character thief = CharacterStepBuilder.newBuilder().name("Tran Minh Hai").fighterClass("Rogue").noWeapon().build();
		LOGGER.info(thief.toString());
	}
}
