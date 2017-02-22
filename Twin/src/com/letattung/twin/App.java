/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/twin
 */
package com.letattung.twin;

public class App {

	public static void main(String [] args) throws Exception{
		BallItem ballItem = new BallItem();
		BallThread ballThread = new BallThread();
		
		ballItem.setTwin(ballThread);
		ballThread.setTwin(ballItem);
		
		waiting();
	    ballItem.click();
	    waiting();
	    ballItem.click();
	    waiting();

	    // exit
	    ballThread.stopMe();
	}
	
	private static void waiting() throws Exception{
		Thread.sleep(1000);
	}
}
