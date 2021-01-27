package com.Coading.Programs;

public class MainProgram {
	
	public static void main(String[] args) {
		
	
		 //Initialize array     
        int [] arr = new int [] {13,424,536,767,25};     
        int temp = 0;    
         
            
        //Sort the array in ascending order    
        for (int i = 0; i < arr.length; i++) {     
            for (int j = i+1; j < arr.length; j++) {     
               if(arr[i] > arr[j]) {    
                   temp = arr[i];    
                   arr[i] = arr[j];    
                   arr[j] = temp;    
               }     
            }     
        }    
          
        for (int i = 0; i < arr.length; i++) {     
            System.out.print(arr[i] + " ");    
        }    
    }    
}    
