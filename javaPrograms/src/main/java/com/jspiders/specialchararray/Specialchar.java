package com.jspiders.specialchararray;

import java.util.Scanner;

public class Specialchar {
	
	public static void special(String str)
	{
		int sum=0;
		int res=0;
		
		for (int j = 0; j < str.length(); j++) {
			char c = str.charAt(j);
			if(c>='a'&& c<='z'|| c>='A' && c<='Z'|| c>='0' &&c<='9'||c==' ')
			{
				sum++;
			}
			else
			{
				res++;
			}
		}
		System.out.println(res);
		
	}
	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the string : ");
		
		String s1 = sc.nextLine();
	
		special(s1);
		
		/*String s1 = "one$two$three$four!five@six$";

		String s2 = s1.replace("$", "");
		String s3 = s1.replace("!", "");
		String s4 = s1.replace("@", "");
		

		int result  = s1.length() - s2.length();
		int result1 = s1.length() - s3.length();
		int result2 = s1.length() - s4.length();
		
		
		System.out.println(result+result1+result2);*/

	}

}
