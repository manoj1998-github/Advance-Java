package com.jspiders.spring.autowiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEmployee {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/springcore.xml");
		
		Employee emp =(Employee) context.getBean("employee");
		System.out.println(emp);
		
		if (context != null) {
			context.close();
		}

	}

}
