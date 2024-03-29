/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

public class Message {

	private final String message;
	
	public Message(String message) {
		super();
		this.message = message;
	}
	
	public String getMessage(){
		return message;
	}
	
	@Override
	public String toString(){
		return message;
	}
}
