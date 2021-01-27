package com.Coading.Programs;

import java.util.Scanner;

public class Palindrome {
	
	public static void isPalindrome(String str)
	{
		int count =0;
		for (int i = 0; i < str.length()/2; i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i))
			{
				count++;
			}
			
		}
		if(count >0)
		{
			System.out.println(str+ " is palindrome");
		}
		else
		{
			System.out.println(str + " is not a palindrome");
		}
		
	}

	public static void main(String[] args) {

		
			Scanner sc = new Scanner(System.in);
			System.out.println(" enter the string");
			String s1 = sc.nextLine();
			isPalindrome(s1);
			
			

	}

}
