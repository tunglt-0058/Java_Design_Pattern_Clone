/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/reactor
 */
package com.letattung.reactor.framework;

import java.nio.channels.SelectionKey;

public class SameThreadDispatcher implements Dispatcher{

	@Override
	public void onChannelReadEvent(AbstractNioChannel channel, Object readObject, SelectionKey key) {
		channel.getHandler().handleChannelRead(channel, readObject, key);
	}

	@Override
	public void stop() throws InterruptedException {
		// no - op
	}

}
