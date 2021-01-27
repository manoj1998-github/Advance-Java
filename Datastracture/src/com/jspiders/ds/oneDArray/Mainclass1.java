package com.jspiders.ds.oneDArray;

public class Mainclass1 {

	public static void main(String[] args) {

		TwoDimensionalArray arr = new TwoDimensionalArray(2,2);
		
		arr.traverse();
		
		arr.valueInsert(0,0,10);
		arr.valueInsert(0,1,20);
		arr.valueInsert(1,0,30);
		arr.valueInsert(1,1,40);
		
		arr.traverse();
		
		arr.accessTheCell(2, 2);

	}
}