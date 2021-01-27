package com.jspiders.spring.PlaneAOP;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestTicket {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=null;
			context = new ClassPathXmlApplicationContext("com/jspiders/spring/PlaneAOP/springconfig.xml");

			
		Passenger pa =	(Passenger)context.getBean("passenger");
		pa.ticketBooking();
		pa.paymentConfirm();
		
		if (context != null) {
			context.close();
		}
	}

}
