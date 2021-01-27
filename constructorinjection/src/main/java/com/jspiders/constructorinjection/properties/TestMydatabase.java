package com.jspiders.constructorinjection.properties;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMydatabase {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context= null;
		context	= new ClassPathXmlApplicationContext("com/jspiders/constructorinjection/properties/springconfig.xml");

	MyDatabase mydb = (MyDatabase)context.getBean("mydatabase");
	System.out.println(mydb);
	
	if (context != null) {
		context.close();
	}

	}

}
