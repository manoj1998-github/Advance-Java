package com.jspiders.replaceCharacter;

public class Replace {

	public static void main(String[] args) {
		
		//replace m by n and h by w
		String str = " my name is hero";
		
		char[] arr = str.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]=='m')
			{
				arr[i]='n';
			}
			if(arr[i]=='h')
			{
				arr[i]='w';
				
			}
		}
		System.out.println(arr);
		
		

	}

}
