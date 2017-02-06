// hoc theo java design pattern tutorial

package com.letattung.interceptingfilterpattern;

public class InterceptingFilterDemo {

	public static void main(String [] args){
		
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("GO TO HOME");
	}
}
