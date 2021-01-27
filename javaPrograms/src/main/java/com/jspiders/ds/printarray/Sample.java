   package com.jspiders.ds.printarray;

public class Sample 
{

		public static int FactUsingRecurssion(int n)
		{
			if(n<1)
			{
				return 1;
			}
			else
			{
				return n=n*FactUsingRecurssion(n-1);
			}
		}
		public static int FactUsingIteration(int n)
		{
			int num=1;
			for(int i=1;i<=n;i++)
			{
				num=i*num;
			}
			return num;
		}

	public static void main(String[] args) 
	{


		int i1 = FactUsingRecurssion(5);
		System.out.println("result :"+ i1);
		
		int i2 = FactUsingIteration(5);
		System.out.println("result :"+i2);
		

	}

}
