package com.jspiders.SumToGiveNum;

public class Sum {
	
	public static void add(int[] arr,int num)
	{
		int count=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[i]+arr[j]==num)
				{
					System.out.println(arr[i] +","+ arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {

		int[] a = {3,2,1,5,0,6};
		add(a,6);

	}

}
