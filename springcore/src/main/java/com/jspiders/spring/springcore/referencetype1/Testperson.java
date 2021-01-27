package com.jspiders.spring.springcore.referencetype1;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Testperson {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/referencetype1/springcore.xml");
		
		
		Person person = (Person)context.getBean("person");
		System.out.println(person);
		
		if(context!=null)
		{
			context.close();
		}

	}

}
