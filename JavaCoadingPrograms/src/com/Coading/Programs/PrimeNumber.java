package com.Coading.Programs;

public class PrimeNumber {
	
	public static void test(int num)
	{
		if(num<0)
		{
			System.out.println("invalid number");
		}
		if(num==0 || num==1)
		{
			System.out.println(num + " is not a prime number");
		}
		if(num==2 || num==3)
		{
			System.out.println(num + " is a prime number");
		}
		if(num * num-1 % 24 == 0)
		{
			System.out.println(num + " is a prime number");
		}
		else
		{
			System.out.println(num +" num is not a prime number ");
		}
	}

	public static void main(String[] args) {

			test(2);

	}

}
