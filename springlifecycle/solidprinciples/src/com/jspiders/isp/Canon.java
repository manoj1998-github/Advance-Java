package com.jspiders.isp;

public class Canon implements PrintMachine,ScanMachine,FaxMachine {

	@Override
	public void fax() {
		System.out.println("fax by canon");
		
	}

	@Override
	public void scan() {
		System.out.println("scan by canon");
		
	}

	@Override
	public void print() {
		System.out.println("print by canon");
		
	}
	
	
}
