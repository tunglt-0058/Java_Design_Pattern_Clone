// hoc theo java design pattern tutorial

package com.letattung.observerpattern1;

public class BinaryObserver extends Observer{

	public BinaryObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
	}

}