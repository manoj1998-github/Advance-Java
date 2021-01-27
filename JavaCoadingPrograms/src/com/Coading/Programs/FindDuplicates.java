package com.Coading.Programs;

public class FindDuplicates {
	
	public static void test(String s)
	{
		char[] c = s.toCharArray();
		for (int i = 0; i < c.length; i++) {
			int count = 0;
			for (int j = i+1; j < c.length; j++) {
				if(c[i]==c[j])
				{
					count++;
					c[j]='0';//Set c[j] to 0 to avoid printing visited character 
				}
			}
			if(count>1 && c[i]!='0')
			{
				System.out.println(c[i]+ " : are the duplicates");
			}
		}
		
		
	}

	public static void main(String[] args) {

			test("mangamma");

	}

}
