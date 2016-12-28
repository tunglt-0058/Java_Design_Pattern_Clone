// hoc theo java design pattern tutorial

package com.letattung.observerpattern1;

public class OctalObserver extends Observer{

	public OctalObserver(Subject subject) {
		// TODO Auto-generated constructor stub
		this.subject = subject;
		this.subject.attach(this);
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		System.out.println("Otal String: " + Integer.toOctalString(subject.getState()));
	}

}