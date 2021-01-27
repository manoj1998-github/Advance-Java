package com.jspiders.spring.autowiring.standalone;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcustomer {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/standalone/springconfig.xml");
		Customer cust = (Customer) context.getBean("customer");
		System.out.println(cust);
		System.out.println(cust.getProducts().getClass());

		if (context != null) {
			context.close();
		}

	}
}
