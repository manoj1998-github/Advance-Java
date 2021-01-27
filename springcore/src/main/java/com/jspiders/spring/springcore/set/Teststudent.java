package com.jspiders.spring.springcore.set;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststudent {

	public static void main(String[] args) {

		
		ClassPathXmlApplicationContext context = null;
		
			context	= new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/set/springconfig.xml");
			
		Person person1 = (Person) context.getBean("person");
		
		System.out.println(person1);
		System.out.println(person1.getContact().getClass());
		
		if(context!=null)
		{
			context.close();
		}

	}

}
