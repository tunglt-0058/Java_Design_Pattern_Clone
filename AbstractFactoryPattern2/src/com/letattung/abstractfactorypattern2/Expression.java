// hoc theo java design pattern trong sourcemaking.com

package com.letattung.abstractfactorypattern2;

public class Expression {

	protected String string;
	
	public Expression(String string) {
		this.string = string;
	}
	
	public Expression cloan(){
		return null;
	}
	
	public String toString(){
		return string;
	}
}
