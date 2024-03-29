/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reader-writer-lock
 */
package com.letattung.rwl;

import java.util.concurrent.locks.Lock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Writer implements Runnable{

	private static Logger LOGGER = LoggerFactory.getLogger(Writer.class);
	private Lock writeLock;
	private String name;
	
	public Writer(String name, Lock writeLock) {
		this.name = name;
		this.writeLock = writeLock;
	}
	
	@Override
	public void run() {
		writeLock.lock();
		try{
			write();
		}catch (InterruptedException e){
			e.printStackTrace();
		} finally {
			writeLock.lock();
		}
	}
	
	public void write() throws InterruptedException{
		LOGGER.info("{} begin", name);
		Thread.sleep(250);
	    LOGGER.info("{} finish", name);
	}
}
