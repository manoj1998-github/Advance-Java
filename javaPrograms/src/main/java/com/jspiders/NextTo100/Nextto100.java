package com.jspiders.NextTo100;

import java.util.Scanner;

public class Nextto100 {
	public static void num(int []arr)
	{
		int temp=0;
		int arr1[] = new int [arr.length];
		
		for (int i = 0; i < arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
			if(arr[i]>100)
			{
				for (int j = 0; j < arr1.length; j++) {
					arr1[j]=arr[i];
				}
				
				System.out.println(arr1[0]);
				
			}
		}
		
	}
	public static void main(String[] args) {

		Scanner ec = new Scanner(System.in);

		System.out.println("enter the no of elements you want in array :");
		int n = ec.nextInt();
		int arr[] = new int[n];
		System.out.println("enter the no of elements :");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ec.nextInt();
		}
		num(arr);

	}

}
