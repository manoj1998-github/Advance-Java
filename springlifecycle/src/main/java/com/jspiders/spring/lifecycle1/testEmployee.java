package com.jspiders.spring.lifecycle1;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEmployee {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/lifecycle1/springconfig.xml");
		
		
		Employee emp=(Employee) context.getBean("employee");
		System.out.println(emp);
		
		if (emp != null) {
			
			context.close();
		}
	}

}
 