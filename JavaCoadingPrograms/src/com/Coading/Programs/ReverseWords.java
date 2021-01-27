package com.Coading.Programs;

public class ReverseWords {

	public static void main(String[] args) {
		
		String s = "my name is man";
		
		String[] c1 = s.split("\\s");
		
		
		for (int  i = c1.length-1;i >= 0; i--) {
			System.out.print(c1[i]+ " ");
		}
	}
}
