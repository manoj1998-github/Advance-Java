package com.jspiders.ds.smallest;

public class Smallest {
	
	public static int iteration(int []a)
	{
		int temp=0;
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i+1]<a[i])
				{
					temp = a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
			
		}
		
		return ( a[a.length-1]);
	}
	
	
	public static int recursion(int []a,int index,int min)
	{
		if(index<a.length)	
		{
		   if(a[index]<min)
			{
				min=a[index];
			}
		   index++;
			
			min = recursion(a,index,min);
		  
		   
		}
		
		return ( min);
	
		
	}
	
	
	
	public static void main(String[] args) {
	
		int []a= {20,50,40,10,50};
		
		//System.out.println("Largest element is :"+ iteration(a));
		System.out.println("Largest element is :"+ recursion(a,0,a[0]));
		
	}


}
