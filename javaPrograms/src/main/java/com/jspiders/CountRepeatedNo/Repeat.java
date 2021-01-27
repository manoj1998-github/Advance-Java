package com.jspiders.CountRepeatedNo;

public class Repeat {

	public static void main(String[] args) {

		int[] arr = {1,2,3,1,2,3,3,3};
		
		int count=0;
		int max=0;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j])
				{
					count++;
				}
			}
		}
		if(count>max)
		{
			
		}

	}

}
