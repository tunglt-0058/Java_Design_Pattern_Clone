/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/tolerant-reader
 */
package com.letattung.tolerantreader;

import java.io.Serializable;

public class RainbowFish implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String name;
	private int age;
	private int lengthMeters;
	private int weightTons;
	
	public RainbowFish(String name, int age, int lengthMeters, int weightTons) {
		this.name = name;
		this.age = age;
		this.lengthMeters = lengthMeters;
		this.weightTons = weightTons;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getLengthMeters() {
		return lengthMeters;
	}

	public int getWeightTons() {
		return weightTons;
	}
	
}