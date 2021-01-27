package com.jspiders.constructorinjection.hospitalmanagementsystem;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testHospital {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= null;
		context	= new ClassPathXmlApplicationContext("com/jspiders/constructorinjection/hospitalmanagementsystem/springconfig.xml");

	Hospital hos = (Hospital)context.getBean("hospital");
	System.out.println(hos);
	
	if (context != null) {
		context.close();
	}
	}

}
