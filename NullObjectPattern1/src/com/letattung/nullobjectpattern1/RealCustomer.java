// hoc theo java design pattern tutorial

package com.letattung.nullobjectpattern1;

public class RealCustomer extends AbstractCustomer{

	public RealCustomer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	@Override
	public boolean isNill() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

}
