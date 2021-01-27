package com.jspiders.ds.Binaryconversion;

import java.util.Scanner;

public class Mainclass {
	static int power(int e,int x)
	{
		int result = 1;
		while (x>0) {
			if(x%2==1)
			{
				result=result*e;
			}
			e=e*e;
			x=x/2;
		}
		return result;
	}

	public static void main(String[] args) {
		
		int i = power(5,3);
		System.out.println(i);
		
		
	}

/*		long n, p, r = 1;

		Scanner sc = new Scanner(System.in);

		System.out.println("enter number");

		n = sc.nextLong();

		System.out.println("enter power");

		p = sc.nextLong();

		if (n >= 0 && p == 0) {
			r = 1;
		} else if (n == 0 && p >= 1) {
			r = 0;
		} else {
			for (int i = 1; i <= p; i++) {
				r = r * n;
			}
			System.out.println(n + "^" + p + "=" + r);
		}
	} */

}
