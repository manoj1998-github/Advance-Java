package com.Coading.Programs;

public class ReverseString {
	
	public static String test(String str)
	{
		
			if(str==null || str.isEmpty())
			{
				return str;
			}
			
		String res = " ";
		for (int  i = str.length()-1;i>=0; i--) {
			res = res+str.charAt(i);
		}
		return res;
	}

	public static void main(String[] args) {

			String str = "my name is manoj";
			String s1 = test(str);
			System.out.println(s1);

	}

}
