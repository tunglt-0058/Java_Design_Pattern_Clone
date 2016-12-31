// hoc theo java design pattern tutorial 

package com.letattung.businessdelegatepattern;

public class BusinessLookUp {

	public BusinessService getBusinessService(String serviceType){
		if (serviceType.equalsIgnoreCase("EJB")){
			return new EJBService();
		}else {
			return new JMSService();
		}
	}
}
