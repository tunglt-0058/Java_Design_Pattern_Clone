/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/twin
 */
package com.letattung.twin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BallItem extends GameItem{

	private static final Logger LOGGER = LoggerFactory.getLogger(BallItem.class);
	private boolean isSuspended;
	private BallThread twin;
	
	public void setTwin(BallThread twin){
		this.twin = twin;
	}
	
	@Override
	public void doDraw() {
		LOGGER.info("doDraw");
	}

	public void move(){
		LOGGER.info("move");
	}
	@Override
	public void click() {
		
		isSuspended = !isSuspended;
		if (isSuspended){
			twin.suspendMe();
		}else{
			twin.resumeMe();
		}
	}

}
