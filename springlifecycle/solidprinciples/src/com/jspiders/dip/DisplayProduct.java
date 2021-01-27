package com.jspiders.dip;

public class DisplayProduct {

	public void display()
	{
		Product product = GetProduct.getService();
		int products = product.readProducts();
		System.out.println("no. of products per page :"+ products/10);
	}
}
