package com.jspiders.constructorinjection.overloading;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testEntity {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context=null;
		context =new ClassPathXmlApplicationContext("com/jspiders/constructorinjection/overloading/springconfig.xml");

		Entity e1 = (Entity)context.getBean("entity");
		System.out.println(e1);
		
		if (context != null) {
			context.close();
		}
	}

}
 