package com.Coading.Programs;

public class Factorial {
	
	public static int num(int n)
	{
		int fact = 1;
		for (int i = 1; i <=n; i++) {
			fact = fact * i;
			
		}
		return fact;
	}

	public static void main(String[] args) {

		int i1 = num(5);
		System.out.println(i1);

	}

}
