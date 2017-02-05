/*
 * hoc theo java design pattern cua iluwatar
 * https://github.com/iluwatar/java-design-patterns/tree/master/monostate
 */
package com.letattung.monostate;

public class App {

	public static void main(String [] args){
		
		LoadBalancer balancer1 = new LoadBalancer();
		LoadBalancer balancer2 = new LoadBalancer();
		balancer1.serverRequest(new Request("Xin chao cac anh em!!!!!"));
		balancer2.serverRequest(new Request("Hohoho"));
	}
}
