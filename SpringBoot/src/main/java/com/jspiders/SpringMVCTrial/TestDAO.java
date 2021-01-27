package com.jspiders.SpringMVCTrial;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.google.protobuf.Service;

public class TestDAO {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext annotation = null;

		annotation = new AnnotationConfigApplicationContext(SpringConfig.class);

		Student student = (Student) annotation.getBean(Student.class);

		ServiceConfig sc = (ServiceConfig) annotation.getBean(ServiceConfig.class);
		//sc.getUserdao().create();
		//int database = sc.getUserdao().useDatabase();
		//System.out.println("data base used : " + database);
		
		int in = sc.getUserdao().insert(student);
		System.out.println("table updated : "+ in );

		annotation.close();

	}
}
