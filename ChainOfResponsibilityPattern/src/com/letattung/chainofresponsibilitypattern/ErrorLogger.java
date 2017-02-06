// hoc theo java design pattern tutorial

package com.letattung.chainofresponsibilitypattern;

public class ErrorLogger extends AbstractLogger{

	public ErrorLogger(int level) {
		// TODO Auto-generated constructor stub
		this.level = level;
	}
	
	@Override
	protected void write(String message) {
		// TODO Auto-generated method stub
		System.out.println("Error::Logger: " + message);
	}

}
