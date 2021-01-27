package com.jspiders.ds.oneDArray;

public class Mainclass {

	public static void main(String[] args) {
		
		
		SingleDimensionArray arr = new SingleDimensionArray(5);
		
		System.out.println(arr);
		
		arr.traverseArray();
		
		arr.ValueTobeInsert(0, 10);
		arr.ValueTobeInsert(1, 20);
		arr.ValueTobeInsert(2, 30);
		arr.ValueTobeInsert(3, 40);
		arr.ValueTobeInsert(4, 50);
		
		arr.traverseArray();
		
		arr.accessCell(3);

		arr.valueToBeSearch(20);
		
		arr.valueToBeDelete(5);
		
		arr.valueToBeDelete(4);
		
		arr.deleteArray();
	}

}
