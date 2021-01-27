package com.Coading.Programs;

public class PalindromeInteger {
	
	public static boolean test(int number)
	{
		int palindrome = number; // copied number into variable
        int reverse = 0;

        while (palindrome != 0) {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome = palindrome / 10;
        }

        // if original and reverse of number is equal means
        // number is palindrome in Java
        if (number == reverse) {
            return true;
        }
        return false;
    }


	public static void main(String[] args) {
		
		Boolean b1 =test(101);
		System.out.println(b1);

	}

}
