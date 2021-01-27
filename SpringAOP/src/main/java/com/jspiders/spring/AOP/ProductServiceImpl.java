package com.jspiders.spring.AOP;//target product

public class ProductServiceImpl implements ProductService {

	@Override
	public void orderProduct() {
		System.out.println("product is ordered");

	}

	@Override
	public void ShippingProduct() {
		System.out.println("shipment is done");
	}

}
