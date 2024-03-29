//hoc theo java design pattern tutorial
package com.letattung.abstractfactorypattern1;

public class AbstractFactoryPatternDemo {

	public static void main(String [] args){
		//get shape factory
		AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
		// create object shape and draw
		Shape shape1 = shapeFactory.getShape("CIRCLE");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("RECTANGLE");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("SQUARE");
		shape3.draw();
		
		//get color factory
		AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
		//create object color and fill
		Color color1 = colorFactory.getColor("BLUE");
		color1.fill();
		
		Color color2 = colorFactory.getColor("GREEN");
		color2.fill();
		
		Color color3 = colorFactory.getColor("RED");
		color3.fill();
	}
}
