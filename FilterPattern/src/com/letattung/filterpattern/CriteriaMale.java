// hoc theo java design pattern tutorial

package com.letattung.filterpattern;

import java.util.ArrayList;

public class CriteriaMale implements Criteria{

	@Override
	public ArrayList<Person> meetCriteria(ArrayList<Person> persons) {
		// TODO Auto-generated method stub
		ArrayList<Person> malePersons = new ArrayList<>();
		
		for(Person person : persons){
			if(person.getGender().equalsIgnoreCase("MALE")){
				malePersons.add(person);
			}
		}
		return malePersons;
	}

}
