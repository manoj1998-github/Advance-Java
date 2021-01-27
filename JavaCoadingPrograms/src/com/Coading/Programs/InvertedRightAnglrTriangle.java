package com.Coading.Programs;

public class InvertedRightAnglrTriangle {
	
	public static void num(int n)
	{
		int a=1;
		for (int i = 1; i <=n; i++) {
			for (int j = n; j >=i; j--) {
				System.out.print(a++ + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

			num(3);
	}

}
