// hoc theo java design pattern tutorial 

package com.letattung.businessdelegatepattern;

public class BusinessDelegate {

	public BusinessService businessService;
	public BusinessLookUp lookUpService = new BusinessLookUp();
	public String serviceType;
	
	public void setServiceType(String serviceType){
		this.serviceType = serviceType;
	}
	
	public void doTask(){
		businessService = lookUpService.getBusinessService(serviceType);
		businessService.doProcessing();
	}
}
