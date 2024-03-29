/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/queue-load-leveling
 */
package com.letattung.qll;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceExecutor implements Runnable{

	private static final Logger LOGGER = LoggerFactory.getLogger(ServiceExecutor.class);
	
	private final MessageQueue messageQueue;
	
	public ServiceExecutor(MessageQueue messageQueue) {
		this.messageQueue = messageQueue;
	}
	
	@Override
	public void run() {
		try{
			while (true){
				Message message = messageQueue.retrieveMessage();
				if (message != null){
					LOGGER.info(message.toString() + " is served.");
				}else {
					LOGGER.info("Service Executor: Waiting for Messages to serve .. ");
				}
				Thread.sleep(1000);
			}
		}catch (InterruptedException ie){
			LOGGER.error(ie.getMessage());
		}catch (Exception e){
			LOGGER.error(e.getMessage());
		}
	}

}
