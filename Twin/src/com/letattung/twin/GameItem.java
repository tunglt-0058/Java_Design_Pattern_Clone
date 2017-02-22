/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/twin
 */
package com.letattung.twin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class GameItem {

	private static final Logger LOGGER = LoggerFactory.getLogger(GameItem.class);
	
	public void draw(){
		LOGGER.info("draw");
		doDraw();
	}
	
	public abstract void doDraw();
	public abstract void click();
}
