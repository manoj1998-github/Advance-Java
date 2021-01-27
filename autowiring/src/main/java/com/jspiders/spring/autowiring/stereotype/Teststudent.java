package com.jspiders.spring.autowiring.stereotype;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Teststudent {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = null;
	context	= new ClassPathXmlApplicationContext("com/jspiders/spring/autowiring/stereotype/springconfig.xml");
	
	Student std = (Student)context.getBean("std");
	System.out.println(std);
	 
	//or if component("std") Student stu = (Student)context.getBean("student"); 
	
	/*Student stu1 = (Student)context.getBean("std");
	Student stu2 = (Student)context.getBean("std");
	System.out.println(stu1.hashCode());
	System.out.println(stu2.hashCode());*/
	
	
	if (context != null) {
		context.close();
	}

	}

}
