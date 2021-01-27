package com.jspiders.spring.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststudent {

	public static void main(String[] args) {


		ClassPathXmlApplicationContext context = null;
		 context = new ClassPathXmlApplicationContext("com/jspiders/spring/springcore/springconfig.xml");//xml path
		Student student = (Student) context.getBean("student");//downcasting and string arg shd be been class name 
		System.out.println(student);
		
		if(context!=null)
		{
			context.close();
		}
		

	}

}
  