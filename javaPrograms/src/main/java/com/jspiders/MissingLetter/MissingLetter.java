package com.jspiders.MissingLetter;

public class MissingLetter {

	public static void main(String[] args) {

		
		String a ="abcde";
		String b ="abcd";
		
		char []c = new char[a.length()];
	    char []d = new char[b.length()];
		
		for(int i=0;i<a.length();i++)
	    {
	        c[i]=a.charAt(i);
	    }
	     for(int i=0;i<b.length();i++)
	    {
	        d[i]=b.charAt(i);
	    }
	        
	    for(int j = 0;j <c.length;j++)
	    {
	        if(j==c.length-2)
	        {
	            j++;
	            System.out.println(c[j]);
	            break;
	        }
	        if(c[j]!=d[j])
	        {
	            System.out.println(c[j]);
	            break;
	        }
	    }
	}
}
