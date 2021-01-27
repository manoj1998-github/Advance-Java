package com.Coading.Programs;

public class HighestRecurringElement {

	public static void sample(int arr[]) {
		int max = 0;
		int index = 0;
		int[] store = new int[arr.length];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			store[i] = count;
		}
		for (int i = 0; i < store.length; i++) {
			if (store[i] > max) {
				max = store[i];
				index = i;
			}
		}
		System.out.println("highly recurring element is " + arr[index]);
	}

	public static void main(String[] args) {

		int[] a = { 10, 20, 20, 10, 20, 10, 10, 10, 10 };
		sample(a);
	}

}
