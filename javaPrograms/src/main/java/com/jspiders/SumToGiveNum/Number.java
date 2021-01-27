package com.jspiders.SumToGiveNum;

public class Number {

	public static void test(int [] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]>arr[j])
				{
					int temp = arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]+ " ");
		}
		
		int pair = arr[arr.length-1]*arr[arr.length-2];
		System.out.println("product :" + pair );
		
		int n = pair%10;
		int m = pair/10;
		int sum = m+n;
		System.out.println(sum);
	}
	public static void main(String[] args) {

		int [] arr1 = { 1,5,-21,4};
		test(arr1);

	}

}
