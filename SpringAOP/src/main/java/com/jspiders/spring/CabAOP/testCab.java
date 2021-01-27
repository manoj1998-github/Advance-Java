package com.jspiders.spring.CabAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testCab {
	
public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context;
		
	context	= new ClassPathXmlApplicationContext("com/jspiders/spring/CabAOP/springconfig.xml");

	
	CabService pro = (CabService)context.getBean("cabServiceimpl");//bean name and upcast to dependent object
	
	
	pro.bookCab();
	pro.payment();
	
	if (context != null) {
		context.close();
	}
	}

}
