package com.jspiders.specialchararray;

import java.util.Scanner;

public class reverseArray {
	
	

	public static void main(String[] args) {

		//String str = "hello world";
		
		//StringBuilder sb = new StringBuilder(str);
		//System.out.println(sb.reverse()); or return sb.toString();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter a string :");
		
		String s = sc.nextLine();
		
		char[] ch = s.toCharArray();
		String st = " ";
		for (int i = ch.length-1; i>=0; i--) 
		{
			st=st+ch[i];
		}
		System.out.println(st);
		
		
		
	}

}
