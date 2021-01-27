package com.jspiders.spring.springinterfaceinjection;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

@Component("displayProductImpl")//high level design
public class DIsplayProductImpl implements DisplayProduct {

	@Autowired
	private ProductDAO product; // bean class

	@Override
	public void display() {

		int numberOfProducts = product.read();
		System.out.println(numberOfProducts / 10);
	}

	public ProductDAO getProduct() {
		return product;
	}

	public void setProduct(ProductDAO product) {
		this.product = product;
	}

	
}
