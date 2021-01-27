package com.jspiders.openclosedprinciple;

public class DiscountCalculator {
	
	double discount=20.0;
	
	public double checkLoyalty(Customer customer)//upcasting using upcasted ref. try to call overridden method
	{											// alwaays get the implementation of subclass
		if(customer.isLoyalCustomer())
		{
			discount = discount*1.5;
		}
		return discount;
	}
}
