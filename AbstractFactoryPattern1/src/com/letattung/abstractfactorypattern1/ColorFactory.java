//hoc theo java design pattern tutorial
package com.letattung.abstractfactorypattern1;

public class ColorFactory extends AbstractFactory{

	@Override
	Shape getShape(String shapeType) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	Color getColor(String colorType) {
		// TODO Auto-generated method stub
		if (colorType == null){
			return null;
		}else if (colorType.equalsIgnoreCase("BLUE")){
			return new Blue();
		}else if (colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		}else if (colorType.equalsIgnoreCase("RED")){
			return new Red();
		}
		return null;
	}

}
