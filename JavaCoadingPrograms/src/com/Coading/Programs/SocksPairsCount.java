package com.Coading.Programs;

import java.util.Arrays;

public class SocksPairsCount {

	public static int method(int arr[]) {
		int socks = 0;
		int pair = 0;
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			count = 1;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) 
				{
					count++;
				}
			}
			System.out.println(count);
			if (count % 2 == 0) {
				socks++;
			}
		}
		return socks;
	}

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 2, 2, 2 };// { 1, 2, 1, 2, 1, 3, 5, 2, 2,1,1};
		int i = method(a);
		System.out.println("no of pairs of socks available : " + i);
	}
}
