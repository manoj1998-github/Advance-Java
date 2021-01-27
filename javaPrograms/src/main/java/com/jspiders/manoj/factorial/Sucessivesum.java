package com.jspiders.manoj.factorial;

import java.util.Scanner;

public class Sucessivesum {

	public static void main(String[] args) {

		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("enter initial energy :");
		 
		 int e1 = sc.nextInt();
		 
		 System.out.println("enter next energy :");
		 int e2 = sc.nextInt();
		 
		 
		 System.out.println("enter coming energy :");
		 int e3  = sc.nextInt();
		 
		 int sum=0;
		 
		 int sum1=e1+e2;
		 int sum2= sum1+e3;
		 int sum3 =e1+sum1+sum2;
		 
		 System.out.println("total energy produced is : " +sum3);

	}

}
