package com.jspiders.ds.reverse;

public class Reverse {
	
	public static int[] iteration(int []a)
	{
		int []b = new int[a.length];
		int j=0;
		for(int i=a.length-1;i>=0;i--)
		{
		b[j]=a[i];
		j++;
		}
		return b;		 
	}
	
	public static int[] recursion(int []a,int[]b,int i,int j)
	{
		if(i>=0)
		{
		b[j]=a[i];	
		 j++;
		 i--;
		 recursion(a,b,i,j);
		}
		
		return b;		
	}

	public static void main(String[] args) {
		int []a = {10,20,30,40,50};
		
		/*int []b = iteration(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(b[i]+" ");
		}*/
		
		int []c = new int[a.length];
		int []d = recursion(a,c,a.length-1,0);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(d[i]+" ");
		}
		
	}

	
}
