/*
 * hoc theo java desin pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/fluentinterface
 */
package com.letattung.fluentinterface.lazy;

import java.util.Iterator;

public abstract class DecoratingIterator<E> implements Iterator<E>{

	protected final Iterator<E> fromIterator;
	private E next;
	
	public DecoratingIterator(Iterator<E> fromIterator) {
		this.fromIterator = fromIterator;
	}
	
	@Override
	public final boolean hasNext(){
		next = computeNext();
		return next != null ;
	}
	
	@Override
	public final E next(){
		if (next == null){
			return fromIterator.next();
		}else{
			final E result = next;
			next = null;
			return result;
		}
	}
	
	public abstract E computeNext();
}
