package com.jspiders.dip;

public class GetProduct {
	
	public static Product getService()
	{
		Product product = new SQLRepository();// upcasting to abstraction
		return product;
	}
}
