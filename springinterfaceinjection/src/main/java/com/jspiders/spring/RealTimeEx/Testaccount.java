package com.jspiders.spring.RealTimeEx;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testaccount {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/RealTimeEx/springconfig.xml");

		Customer cus = (Customer) context.getBean("customer");

		System.out.println(cus);

		if (context != null) {
			context.close();
		}
	}

}
