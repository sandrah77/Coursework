/* 
Create a program with a (recursive) method that takes a String paremeter 
and returns true if the String is a palindrome and false otherwise. Compare 
this recursive version with the iterative version you wrote in past weeks. 
Which one seems clearer to you?
*/

import java.util.Scanner;

public class Ex04_palindrome {

	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	Ex04_palindrome t = new Ex04_palindrome();
	System.out.println("Please enter a word to be evaluaded as a palindrome: ");
	String test = input.nextLine();
	System.out.println("This word is " + (t.palindrome(test)));


	}
	
	public boolean palindrome(String myString) {
		// base case for a string with 0 and 1 char
		if (myString.length() == 0 || myString.length() == 1){
			return true;
		} 
		//base case for the char being equivalent to the last character
		if (myString.charAt(0) == myString.charAt(myString.length()-1)){
			// return the method on itself with a substring or a subtring and take 
			// 1 away from end of the string everytime.
			return palindrome(myString.substring(1, myString.length()-1));
		}

		else 
			return false;
	}
}