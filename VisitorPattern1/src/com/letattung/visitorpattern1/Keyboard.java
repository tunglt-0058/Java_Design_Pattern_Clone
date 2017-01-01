// hoc theo java design pattern tutorial

package com.letattung.visitorpattern1;

public class Keyboard implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}