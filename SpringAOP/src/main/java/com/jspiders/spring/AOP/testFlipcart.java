package com.jspiders.spring.AOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testFlipcart {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = null;
		context = new ClassPathXmlApplicationContext("com/jspiders/spring/AOP/springconfig.xml");

		ProductService pd = (ProductService) context.getBean("productserviceimpl");//upcasting
		
		
		pd.orderProduct();
		pd.ShippingProduct();

		
		if (context != null) {
			context.close();
		}
	}

}
