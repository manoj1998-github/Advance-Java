package com.jspiders.fiboniccseries;

public class MAinmethod {

	public static void num(int n)
	{
		int a =0;
		int b = 1;
		int c = a + b;
		
		System.out.println(b);
		for (int i = 0; i < n; i++) {
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
		}
	}
	
	public static void main(String[] args) {
		
		num(6);
	}
	
}
