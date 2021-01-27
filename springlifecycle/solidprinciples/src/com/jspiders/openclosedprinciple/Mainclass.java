package com.jspiders.openclosedprinciple;

public class Mainclass {

	public static void main(String[] args) 
	{
		VehicleLoan customer = new VehicleLoan();
		//GoldLoan customer = new GoldLoan();
		//HomeLoan customer = new HomeLoan();
		DiscountCalculator calculate = new DiscountCalculator();
	    double discount	= calculate.checkLoyalty(customer);
	
	System.out.println("Customer discount is : "+ discount);

	}

}
