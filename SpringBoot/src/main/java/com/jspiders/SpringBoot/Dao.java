package com.jspiders.SpringBoot;

import org.springframework.stereotype.Component;

@Component
public class Dao {

	public void create() {
		System.out.println("database created");
	}
	
	public void hii()
	{
		System.out.println("hii init method is invoked");
	}

	public void bye()
	{
		System.out.println("bye destroy method is invoked");
	}
}
