// hoc theo java design pattern tutorial

package com.letattung.decoratorpattern1;

public class DecoratorPatternDemo {

	public static void main(String [] args){
		
		Shape cricle = new Cricle();
		Shape rectangle = new Rectangle();
		
		RedShapeDecorator redCricle = new RedShapeDecorator(new Cricle());
		RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());
		
		System.out.println("Circle with normal border");
		cricle.draw();
		System.out.println("\nCricle of red border");
		redCricle.draw();
		
		System.out.println("\nRectangle with normal border");
		rectangle.draw();
		System.out.println("\nRectangle of red border");
		redRectangle.draw();
	}
}
