package com.jspiders.spring.autowiring.SpEL;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEntity {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		context	= new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/SpEL/springconfig.xml");
	
		Entity ent= (Entity)context.getBean("entity");
		System.out.println(ent);
	
	
	
	
	
	if (context != null) {
		context.close();
	}

	}

}
