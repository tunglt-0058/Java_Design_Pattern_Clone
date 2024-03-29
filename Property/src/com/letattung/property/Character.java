/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/property
 */
package com.letattung.property;

import java.util.HashMap;
import java.util.Map;

public class Character implements Prototype{

	private final Prototype prototype;
	private final Map<Stats, Integer> prototies = new HashMap<>();
	
	private String name;
	private Type type;
	
	public Character() {
		this.prototype = new Prototype() { // null value object
			
			@Override
			public void set(Stats stat, Integer val) {}
			
			@Override
			public void remove(Stats stat) {}
			
			@Override
			public boolean has(Stats stat) {
				return false;
			}
			
			@Override
			public Integer get(Stats stat) {
				return null;
			}
		};
	}
	
	public Character(Type type, Prototype prototype){
		this.type = type;
		this.prototype = prototype;
	}
	
	public Character(String name, Character prototype){
		this.name = name;
		this.type = prototype.type;
		this.prototype = prototype;
	}
	
	public String getName(){
		return name;
	}
	
	public Type getType(){
		return type;
	}
	
	@Override
	public Integer get(Stats stat) {
		boolean containsValue = prototies.containsKey(stat);
		if (containsValue){
			return prototies.get(stat);
		}else {
			return prototype.get(stat);
		}
	}

	@Override
	public boolean has(Stats stat) {
		return get(stat) != null;
	}

	@Override
	public void set(Stats stat, Integer val) {
		prototies.put(stat, val);
	}

	@Override
	public void remove(Stats stat) {
		prototies.put(stat, null);
	}

	@Override
	public String toString(){
		StringBuilder builder = new StringBuilder();
		if (name != null){
			builder.append("Player: ").append(name).append('\n');
		}
		if (type != null){
			builder.append("Character type: ").append(type.name()).append('\n');
		}
		builder.append("Stats:\n");
	    for (Stats stat : Stats.values()) {
	      Integer value = this.get(stat);
	      if (value == null) {
	        continue;
	      }
	      builder.append(" - ").append(stat.name()).append(':').append(value).append('\n');
	    }
	    
	    return builder.toString();
	}
}
