package com.jspiders.isp;

public class Epson implements PrintMachine,ScanMachine {

	@Override
	public void scan() {
		System.out.println("scan by epson");
		
	}

	@Override
	public void print() {
		System.out.println("print by epson");
		
	}

}
