/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/tolerant-reader
 */
package com.letattung.tolerantreader;

public class RainbowFishV2 extends RainbowFish{

	private static final long serialVersionUID = 1L;

	public boolean sleeping;
	public boolean hungry;
	public boolean angry;
	
	public RainbowFishV2(String name, int age, int lengthMeters, int weightTons) {
		super(name, age, lengthMeters, weightTons);
	}
	
	public RainbowFishV2(String name, int age, int lengthMeters, int weightTons, boolean sleeping, 
			boolean hungry, boolean angry) {
		this(name, age, lengthMeters, weightTons);
		this.sleeping = sleeping;
		this.hungry = hungry;
		this.angry = angry;
	}

	public boolean getSleeping() {
		return sleeping;
	}

	public boolean getHungry() {
		return hungry;
	}

	public boolean getAngry() {
		return angry;
	}
	
}
