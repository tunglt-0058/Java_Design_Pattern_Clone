/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.store;

import com.letattung.flux.action.Action;
import com.letattung.flux.action.ActionType;
import com.letattung.flux.action.Content;
import com.letattung.flux.action.ContentAction;

public class ContentStore extends Store{

	private Content content = Content.PRODUCTS;
	
	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.CONTENT_CHANGED)){
			ContentAction contentAction = (ContentAction) action;
			content = contentAction.getContent();
		}
	}

	public Content getContent(){
		return content;
	}
}
