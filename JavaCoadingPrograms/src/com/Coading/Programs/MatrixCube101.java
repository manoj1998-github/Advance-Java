package com.Coading.Programs;

public class MatrixCube101 {
	
	public static void num(int n)
	{
		int a =1 ;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <n; j++) {
				System.out.print(a +" ");
				if(a==1)
				{
					a=0;
				}
				else
				{
					a=1;
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		num(3);

	}

}
