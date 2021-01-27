package com.jspiders.SpringBoot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class TestDAO {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(SpringConfig.class);

		Service service= (Service)context.getBean(Service.class);
		//Service service1 =(Service)context.getBean(Service.class);
		service.getDao().create();
		//System.out.println(service.hashCode());
		//System.out.println(service1.hashCode());
		
		
		if (context != null) {
			context.close();
		}

	}

}
