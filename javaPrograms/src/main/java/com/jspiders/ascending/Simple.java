package com.jspiders.ascending;

class Simple {

	public static void test(int ...a)//special arguements with (.) operator represents array
	{
		System.out.println(a[0]);
		System.out.println(a[a.length/2]);
		System.out.println(a[a.length-1]);
	}
	public static void main(String[] args) {

		int []a = {10,20,30,40,50};
		
		test(a);
		

	}

}
