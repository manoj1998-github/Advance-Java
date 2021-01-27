package com.jspiders.spring.springinterfaceinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testDisplayProduct {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context;
		
	context	= new ClassPathXmlApplicationContext("com/jspiders/spring/springinterfaceinjection/springconfig.xml");

	//DIsplayProductImpl pro = (DIsplayProductImpl)context.getBean("displayproductimpl");//for xml config
	DIsplayProductImpl pro = (DIsplayProductImpl)context.getBean("displayProductImpl");//bean name and upcast to dependent object
	
	pro.display();
	
	if (context != null) {
		context.close();
	}
	}

}
