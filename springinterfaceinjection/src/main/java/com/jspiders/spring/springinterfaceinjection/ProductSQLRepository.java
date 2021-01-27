package com.jspiders.spring.springinterfaceinjection;

import org.springframework.stereotype.Component;

@Component
public class ProductSQLRepository implements ProductDAO // low level design
{

	public int read() {

		return 100;
	}

}
