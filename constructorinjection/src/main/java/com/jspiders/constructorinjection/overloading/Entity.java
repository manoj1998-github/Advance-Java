package com.jspiders.constructorinjection.overloading;

public class Entity {
	
	public Entity(double a,double b)
	{
		System.out.println("double constructor is called");
		System.out.println(" a and b value is "+a +","+b);
		
	}
	public Entity(int a,int b)
	{
		System.out.println("int constructor is called ");
		System.out.println(" a and b value is "+a +","+b);
	}
	public Entity(String a,String b)
	{
		System.out.println("String constructor is called ");
		System.out.println(" a and b value is "+a +","+b);
	}
}
/* by default String constructor will called 1st later other constructors called from the top
   to avoid this we can use the argument such as
   
   1) type
   2) index
   3) name*/
  