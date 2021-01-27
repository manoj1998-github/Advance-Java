package com.Coading.Programs;

public class SortingHighestNoProduct {

	public static void sort(int[] arr) {
		int temp = 0;
		int pair = 0;
		int unit = 0;

		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					temp = arr[j];
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

		pair = arr[arr.length - 1] * arr[arr.length - 2];
		System.out.println(pair);

		int temp1 = pair % 10;
		int temp2 = pair / 10;
		int res = temp1 + temp2;

		System.out.println(res);

	}

	public static void main(String[] args) {

		int[] arr = { 1,42,35,2,23, };
		sort(arr);

	}

}
