package com.Coading.Programs;

public class CountNumbersInaString {

	public static void main(String[] args) {

		int count=0;
		int number=0;
		String str = "manoj123kumar56";
		
		for (int i = 0; i < str.length(); i++) {
			char a = str.charAt(i);
			if(a>'0' && a<'9')
			{
				count++;
			}
			else
			{
				number++;
			}
		}
		System.out.println(count);

	}

}
