package com.jspiders.SpringMVC;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestService {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = null;
		context = new AnnotationConfigApplicationContext(SpringConfig.class);// creating SpringConfig class object

		Service service = context.getBean(Service.class);// using context reference calling service object
		service.getDao().create();// in service class we have UserDao as reference calling getter method to call
									// method present in the respective class

		context.close();

	}
}
