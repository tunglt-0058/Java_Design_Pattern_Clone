/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-asynchronous
 */
package com.letattung.event.asynchronous;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Event implements IEvent, Runnable{

	private static final Logger LOGGER = LoggerFactory.getLogger(Event.class);
	private int eventId;
	private int eventTime;
	private boolean isSynchronous;
	private Thread thread;
	private boolean isComplete = false;
	private ThreadCompleteListener eventListener;
	
	public Event(final int eventId, final int eventTime, final boolean isSynchronous) {
		this.eventId = eventId;
		this.eventTime = eventTime;
		this.isSynchronous = isSynchronous;
	}
	
	public boolean isSynchronous(){
		return isSynchronous;
	}
	
	@Override
	public void run() {
		long currentTime = System.currentTimeMillis();
		long endTime = currentTime + (eventTime * 1000);
		while (System.currentTimeMillis() < endTime){
			try{
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
				return;
			}
		}
		isComplete = true;
		completed();
	}

	@Override
	public void start() {
		thread = new Thread(this);
		thread.start();
	}

	@Override
	public void stop() {
		if (thread == null){
			return;
		}
		thread.interrupt();
	}

	@Override
	public void status() {
		if (!isComplete){
			LOGGER.info("[{}] is not done.", eventId);
		}else{
			LOGGER.info("[{}] is done.", eventId);
		}
	}

	public final void addListener(final ThreadCompleteListener listener){
		this.eventListener = listener;
	}
	
	public final void removeListener(){
		this.eventListener = null;
	}
	
	private final void completed(){
		if (eventListener != null){
			eventListener.completedEventHandler(eventId);
		}
	}
	
}
