package com.jspiders.spring.AOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class EmailConfirmation {

	@After("execution( public void orderProduct())")//*.ProductServiceImpl.orderProduct())"
	public  void orderConfirm(JoinPoint point ) {
		
		System.out.println("Your order is confirmed");
		
	}
	
	@After("execution(public void ShippingProduct())")
	public  void shippingConfirm(JoinPoint point) {

		System.out.println("Your shippment is done");
	}
	
	
}

