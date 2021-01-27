package com.jspiders.ds.printarray;

public class Demo {
	
	public static void displayUsingRecurssion(int count)
	{
		if(count>0)
		{
			System.out.println("welcome to dsss");
			count--;
			displayUsingRecurssion(count);
		}
	}
	public static void displayUsingIteration(int count)
	{
		for(int i=1;i<=count;i++)
		{
			System.out.println("welcome to ds");
		}
	}

	public static void main(String[] args) {

		displayUsingRecurssion(5);
		displayUsingIteration(5);

	}

}
