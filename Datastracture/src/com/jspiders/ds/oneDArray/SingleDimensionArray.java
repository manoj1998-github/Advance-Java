package com.jspiders.ds.oneDArray;

public class SingleDimensionArray {

	private int array[];

	//creating an array
	public SingleDimensionArray(int size) {
		this.array = new int[size];
		System.out.println("array is sucessfully created");
		for (int i = 0; i < array.length; i++) {

			array[i] = Integer.MIN_VALUE;
		}
	}

	//traversing an array
	public void traverseArray() {
		try {
			for (int i = 0; i < array.length; i++) {
				System.out.println(array[i]);
			}
		} catch (Exception e) {

			System.err.println("Array is not created");
		}
	}

	//insert an array
	public void ValueTobeInsert(int index, int value) {
		try {
			if (array[index] == Integer.MIN_VALUE) {
				array[index] = value;
			}
			else
			{
				System.err.println(index + "index is already occupied");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("invalid index");
		}
	}
	 
	//access an array
	public void accessCell( int index)
	{
		try {
			System.out.println("element present in the given index : " + array[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("invalid index");
		}
	}
	
	//search an array
	public void valueToBeSearch(int value)
	{
		for (int i = 0; i < array.length; i++) {
			if(array[i]==value) {
				System.out.println("value found at the index :" + i);
				return;
			}
		}
	}
	
	//delete the value
	public void valueToBeDelete(int index) {
		
		try {
			array[index] = Integer.MIN_VALUE;
			System.out.println(" value deleted in the given index");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("Invalid index");
		}
	}
	
	//delete the array
	public void deleteArray()
	{
		this.array= null;
		System.out.println("array is deleted");
	}

}
