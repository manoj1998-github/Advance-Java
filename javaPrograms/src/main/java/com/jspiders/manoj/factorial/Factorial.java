package com.jspiders.manoj.factorial;

import java.util.Scanner;

public class Factorial {
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

		// Scanner sc = new Scanner(System.in);

		// System.out.println("Enter an integer value : ");

		int n = 5;
		// n = sc.nextInt();

		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println(fact);

		fact = 12000;

		int zero = 0;

		for (int i = 10000; i > 0; i--) {
			if (fact % 10 == 0) {
				zero = zero + 1;
				fact = fact / 10;
			} else {
				System.out.println(zero);
				break;
			}
		}

		System.out.println("no of zero's present in factorial sum is :" + zero);

		// Factorial f1 = new Factorial();
		// 5f1.fact(5);
	}
}
