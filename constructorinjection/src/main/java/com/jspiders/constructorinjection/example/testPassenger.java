 package com.jspiders.constructorinjection.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testPassenger {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=null;
		context =	new ClassPathXmlApplicationContext("com/jspiders/constructorinjection/springconfig.xml");
		
		Passenger pas1 = (Passenger)context.getBean("passenger");
		System.out.println(pas1);
		
		if (context != null) {
			context.close();
		}
	}

}
