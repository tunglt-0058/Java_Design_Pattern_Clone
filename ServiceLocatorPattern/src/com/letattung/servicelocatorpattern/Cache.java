// hoc theo java design pattern tutorial 

package com.letattung.servicelocatorpattern;

import java.util.ArrayList;

public class Cache {

	private ArrayList<Service> services;
	
	public Cache() {
		services = new ArrayList<>();
	}
	
	public Service getService(String serviceName){
		for (Service service : services){
			if (service.getName().equalsIgnoreCase(serviceName)){
				System.out.println("Returning cached " +serviceName + " object");
				return service;
			}
		}
		return null;
	}
	
	public void addService(Service newService){
		boolean exists = false;
		
		for (Service service : services){
			if (service.getName().equalsIgnoreCase(newService.getName())){
				exists = true;
			}
		}
		if (!exists){
			services.add(newService);
		}
	}
}
