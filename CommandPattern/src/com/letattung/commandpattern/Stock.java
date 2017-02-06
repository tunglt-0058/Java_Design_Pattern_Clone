// hoc theo java design pattern tutorial

package com.letattung.commandpattern;

public class Stock {

	private String name = "XYZ";
	private int quantity = 10;
	
	public void buy(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
	}
	
	public void sell(){
		System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
	}
}
