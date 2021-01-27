package com.Coading.Programs;

public class InvertedPyramid {

	public static void num(int n) {

		for(int i=n ;i>0;i--)
        {
        	for(int j=0;j<n-i;j++)
        	{
        		System.out.print(" ");
        	}
        	for(int k=0;k<i;k++)
        	{
        		System.out.print("* ");
        	}
        	System.out.print("");
        }
		
	}

	public static void main(String[] args) {

		num(3);

	}

}
