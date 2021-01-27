package com.jspiders.ds.Anaalysis;

public class Case2 {  //linear time complexity    Big O(n)
	
	public static void display(int num)
	{
		for (int i = 1; i <= num; i++) 
		{
			System.out.println("i :" +i);
		}
	}
	public static void main(String[] args) {

		System.out.println("main()  starts........");
		
		display(5);
		
		System.out.println("main() ends.....");
		
	
	}
}
