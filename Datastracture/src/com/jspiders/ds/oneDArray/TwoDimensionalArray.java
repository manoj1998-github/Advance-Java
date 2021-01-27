package com.jspiders.ds.oneDArray;

public class TwoDimensionalArray {

	private int array[][];

	public TwoDimensionalArray(int row, int col) {
		this.array = new int[row][col];
		System.out.println("Two dimentional array got created");

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = Integer.MIN_VALUE;
			}
		}
	}

	public void traverse() {
		try {
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array[i].length; j++) {
					array[i][j] = Integer.MIN_VALUE;
					System.out.println(array[i][j]);
				}
			}
		} catch (Exception e) {
			System.out.println("array is not created");
		}
	}

	public void valueInsert(int row, int col, int value) {
		try {
			if (array[row][col] == Integer.MIN_VALUE) {
				array[row][col] = value;
			} else {
				System.out.println("array occupied with elements");
			}

		} catch (ArrayIndexOutOfBoundsException e) {

			System.err.println("invalid input");
		}
	}

	public void accessTheCell(int row, int col) {
		try {
			System.out.println("element present in the index :" + array[row] + "," + array[col]);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("invalid index");
		}
	}

	public void valueTobeSearch(int value) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == value) {
					System.out.println("value found at the index :" + i + "," + j);
					return;
				}
			}
		}
	}

	public void valueToDelete(int row, int col) {
		try {
			array[row][col] = Integer.MIN_VALUE;
			System.out.println("array got deleted");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.err.println("invalid index");
		}
	}

	public void deleteArray() {
		this.array = null;
		System.out.println("array is deleted");
	}

}
