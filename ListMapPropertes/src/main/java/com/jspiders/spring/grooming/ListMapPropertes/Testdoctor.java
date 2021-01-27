package com.jspiders.spring.grooming.ListMapPropertes;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testdoctor {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/grooming/ListMapPropertes/springconfig.xml");
		
		
		Doctor doc= (Doctor)context.getBean("doctor");
		
		System.out.println(doc);

		if (context != null) {
			context.close();
		}
	}

}
