/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/specification
 */
package com.letattung.specification.app;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.letattung.specification.creature.Creature;
import com.letattung.specification.creature.Dragon;
import com.letattung.specification.creature.Goblin;
import com.letattung.specification.creature.KillerBee;
import com.letattung.specification.creature.Octopus;
import com.letattung.specification.creature.Shark;
import com.letattung.specification.creature.Troll;
import com.letattung.specification.property.Color;
import com.letattung.specification.property.Movement;
import com.letattung.specification.selector.ColorSelector;
import com.letattung.specification.selector.MovementSelector;

public class App {

	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	public static void main(String [] args){
		
		List<Creature> creatures =
		        Arrays.asList(new Goblin(), new Octopus(), new Dragon(), new Shark(), new Troll(),
		        		new KillerBee());
		LOGGER.info("Find all walking creatures");
		List<Creature> walkingCreatures = creatures.stream().filter(new MovementSelector
				(Movement.WALKING)).collect(Collectors.toList());
		walkingCreatures.stream().forEach(c -> LOGGER.info(c.toString()));
		// find all dark creatures
		LOGGER.info("Find all dark creatures");
		List<Creature> darkCreatures = 
				creatures.stream().filter(new ColorSelector(Color.DARK)).collect(Collectors.toList());
		darkCreatures.stream().forEach(c -> LOGGER.info(c.toString()));
		// find all red and flying creatures
		LOGGER.info("Find all red and flying creatures");
		List<Creature> redAndFlyingCreatures = creatures.stream()
		            .filter(new ColorSelector(Color.RED).and(new MovementSelector(Movement.FLYING)))
		            .collect(Collectors.toList());
		redAndFlyingCreatures.stream().forEach(c -> LOGGER.info(c.toString()));
	}
}
