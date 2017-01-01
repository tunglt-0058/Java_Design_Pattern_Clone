// hoc theo java design pattern tutorial

package com.letattung.visitorpattern1;

public class Mouse implements ComputerPart{

	@Override
	public void accept(ComputerPartVisitor computerPartVisitor) {
		computerPartVisitor.visit(this);
	}

}