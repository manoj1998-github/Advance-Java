package com.jspiders.specialchararray;

import java.util.Scanner;

public class factorial {
	
	public static int factorial(int n)
	{
		int fact=1;
		if(n==0)
		{
			return 1;
		}
		else
		{
			return (n*factorial(n-1));
		}
		
		
	}

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);

	
	System.out.println("enter the number");
	int i= sc.nextInt();
	int i1= factorial(i);
	System.out.println(i1);
	}

}
