package com.jspiders.ds.largestarray;

public class Largestelement {
	
	public static int maxUsingIterator(int a[])
	{
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}	
		}
		return max;
	}
	public static int maxUsingRecurssion(int a[],int index)
	{
		
		int max=a[0];
		if(a[index]>max)
			{
				max=a[index];
			}
		index++;
		maxUsingRecurssion(a,index);
		return max;
	}

	public static void main(String[] args) {

		
		int a[] = {10,20,30};
		maxUsingIterator(a);
		
		int	index = 0;
		maxUsingRecurssion(a,index);

	}

}
