package com.jspiders.SpringBootUsedCase;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAccount {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext annotation = null;
		
		annotation  = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		
		Service res = (Service)annotation.getBean(Service.class);
		System.out.println(res);
		double amt = res.getCurrentac().getbal();
		double amt1 =res.getSavingsac().getbal();
		System.out.println(amt);
		System.out.println(amt1);
		
		
		if (res != null) {
			annotation.close(); 
		}

	}

}
