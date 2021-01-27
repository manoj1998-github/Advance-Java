package com.jspiders.spring.springcore.propertycollection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcountry {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
		
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/propertycollection/springcore.xml");
		
		
		Country country1 = (Country)context.getBean("country");
		System.out.println(country1);
		System.out.println(country1.getStatesandlanguages().getClass());//it is not a interface we can directly 
		
		if(context!=null)
		{
			context.close();
		}
	}

}
