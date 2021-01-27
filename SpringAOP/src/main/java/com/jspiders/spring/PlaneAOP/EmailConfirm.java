package com.jspiders.spring.PlaneAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmailConfirm {

	@After("execution(public void ticketBooking())")
	public void ticketConfirm(JoinPoint point)
	{
		System.out.println("your ticket is confirmed");
	}
	@After("execution(public void paymentConfirm())")
	public void paymentConfirm(JoinPoint point)
	{
		System.out.println("your payment is confirmed");
	}
}
