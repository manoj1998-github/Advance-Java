package com.Coading.Programs;

public class FiboincciSeries {
	
	public static void num(int num)
	{
		int a =0;
		int b=1;
		int c = a+b;
		System.out.println(b);
		for (int i = 1; i < num; i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;	
		}
	}

	public static void main(String[] args) {
		num(15);
		
	}

}
