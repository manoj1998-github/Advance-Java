package com.jspiders.spring.CabAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect @Component
public class EmailConfirmation {

	@After("execution( public void bookCab())")//*.ProductServiceImpl.orderProduct())"
	public  void bookingConfirm(JoinPoint point ) {
		
		System.out.println("Your booking is confirmed");
		
	}
	
	@After("execution(public double payment())")
	public  void paymentConfirm(JoinPoint point) {

		System.out.println("Your payment is confirmed");
	}
}
