package com.jspiders.spring.springcore.map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Testcustomer {

	public static void main(String[] args) {
		
		
		ClassPathXmlApplicationContext context= null;
		
			context =  new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/map/springcore.xml");
			
			
				Customer customer1 = (Customer) context.getBean("customer");
				System.out.println(customer1);
				System.out.println(customer1.getProduct().getClass());
				
				
				if(context!=null)
				{
					context.close();
				}

	}

}
 