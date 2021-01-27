package com.jspiders.ds.printarray;

import java.util.Scanner;

public class Sample1 {
	
	static Scanner sc	= new Scanner(System.in);

	public static void displayUsingIteration(int a[]) {
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);
		}

	}

	public static void displayUsingRecurssion(int a[], int index) 
	{

		if (index < a.length) 
		{
			System.out.println(a[index]);
			index++;
			displayUsingRecurssion(a, index);

		}
	}	
		public static void inputUsingIteration(int a[])
		{
			System.out.println("enter the value to insert :");
			
			for(int i=0;i<a.length;i++)
			{
				a[i]=sc.nextInt();
			}
		}
		
		public static void inputUsingRecurssion(int a[],int index)
		{
			if(index<a.length)
			{
				a[index]=sc.nextInt();
				index++;
				inputUsingRecurssion(a,index);
			}
		}
	
	

	public static void main(String[] args) {
	
		int size = 0 ;
		
		System.out.println("enter size of an array:");
		
		
		size = sc.nextInt();
		int a[] = new int[size];
		
		inputUsingIteration(a);
		
		
		
		//int a[] = { 10, 20, 30 };

		displayUsingIteration(a);

		/*System.out.println("method2 starts");

		int index = 0;
		displayUsingRecurssion(a, index);
		
		
	

		System.out.println(" main ends");*/
	}

}
