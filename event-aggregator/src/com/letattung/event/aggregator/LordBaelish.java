/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/event-aggregator
 */
package com.letattung.event.aggregator;

public class LordBaelish extends EventEmitter{

	public LordBaelish() {
		super();
	}
	
	public LordBaelish(EventObserver observer){
		super(observer);
	}
	
	@Override
	public void timePasses(Weekday weekday) {
		if (weekday.equals(Weekday.FRIDAY)){
			notifyObservers(Event.STARK_SIGHTED);
		}
	}

}
