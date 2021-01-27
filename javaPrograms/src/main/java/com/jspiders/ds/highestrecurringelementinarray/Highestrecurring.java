package com.jspiders.ds.highestrecurringelementinarray;


public class Highestrecurring {

	public static void main(String[] args)
	{
		 int [] array = {10,20,10,20,20,30};
		 int temp = 0;
		 int temparr[] = new int[array.length];
		 int index =0;
		 int max = 0;
		 for (int i = 0; i < array.length; i++) {
		        int count = 0;
		        for (int j = 0; j < array.length; j++) {
		          if (array[i]==array[j]) {
		              count++;
		    }	
		  }
		temparr[i]=count;
		System.out.println(temparr[i]);
		}
		 for (int i = 0; i < temparr.length; i++) {
			if(temparr[i]>max)
			{
				max=temparr[i];
				index=i;
			}
		}
		 System.out.println("array element " + array[index]+" is recurring " + temparr[index] );
		 		
	}	
		
	}
	


