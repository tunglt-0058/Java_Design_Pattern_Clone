/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/flux
 */
package com.letattung.flux.store;

import com.letattung.flux.action.Action;
import com.letattung.flux.action.ActionType;
import com.letattung.flux.action.MenuAction;
import com.letattung.flux.action.MenuItem;

public class MenuStore extends Store{

	private MenuItem selected = MenuItem.HOME;

	@Override
	public void onAction(Action action) {
		if (action.getType().equals(ActionType.MENU_ITEM_SELECTED)){
			MenuAction menuAction = (MenuAction) action;
			selected = menuAction.getMenuItem();
			notifyChange();
		}
	}
	
	public MenuItem getSelected(){
		return selected;
	}
}
