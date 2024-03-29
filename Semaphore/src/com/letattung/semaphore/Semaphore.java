/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/semaphore
 */
package com.letattung.semaphore;

public class Semaphore implements Lock{

	private final int licenses;
	private int counter;
	
	public Semaphore(int licenses) {
		this.licenses = licenses;
		this.counter = licenses;
	}
	
	public int getNumLicenses(){
		return licenses;
	}
	
	public int getAvailableLicenses(){
		return counter;
	}
	
	public synchronized void acquire() throws InterruptedException {
		while (counter == 0){
			wait();
		}
		counter = counter - 1;
	}

	public synchronized void release(){
		if (counter < licenses){
			counter = counter + 1;
			notify();
		}
	}

}
