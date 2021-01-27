package com.jspiders.ReverseStringByWords;

public class ReverseStringByWords {

	public static void main(String[] args) {

			String s1 = "My name is manoj";
			String[] c = s1.split("\\s");//splits the string based on whitespace  
			
			for (int i = c.length-1;i >= 0; i--) {
				System.out.print(c[i] +" ");
			}

	}

}
