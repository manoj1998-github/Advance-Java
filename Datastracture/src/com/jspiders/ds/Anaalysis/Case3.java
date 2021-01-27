

package com.jspiders.ds.Anaalysis;

public class Case3 {		//big O(n2)  Quadratic time complexity
	
	public static void display(int num)
	{
		for (int i = 0; i < 5; i++) 
		{
			for (int j = 0; j < num; j++) 
			{
				System.out.println("java");  //5*num = 5*3= 15 times print
			}
		}
	}
	public static void main(String[] args) {

		System.out.println("main()  starts........");
		
		display(3);
		
		System.out.println("main() ends.....");
		
	
	}

}
