package com.jspiders.ascending;

public class Mainmethod {

	public static void main(String[] args) {

		int[] arr =  { 85, 100, 0, -25, -99, 30, 60, 10 };

		int a = 0;
		for (int i = 0; i <arr.length-1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					a = arr[i];
					arr[i] = arr[j];
					arr[j] = a;
				}
			}
		}

		//for (int i = 0; i < arr.length; i++) {
			//System.out.println(arr[i]);
		//}
		System.out.println(arr[1]);//second highest
System.out.println(arr[arr.length-1]);//last element
	}

}
