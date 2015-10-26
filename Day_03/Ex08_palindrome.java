/* A palindrome is a word, phrase, number, or other sequence of units that may be read 
the same way in either direction. Examples of strict palindromes include “ABBA”, “madam”,
 “radar”, “kayak”, and “step on no pets”. Write a program that reads a text and detects 
 whether the text is a strict palindrome.
*/

import java.util.Scanner;


public class Ex08_palindrome {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter their string of text.
		System.out.println ("Enter a string of text to be tested for being a palindrome: ");
		String palindrome = input.nextLine();
		
		// Insert the index of the first character in the String
		int min = 0;
		
		// Index of the last character.
		int max = palindrome.length() - 1;

		boolean isPalindrome = true;
		while (min < max) {
			if (palindrome.charAt(min) != palindrome.charAt(max)) {
				isPalindrome = false;
				break;
			}
			min++;
			max--;
		}
		
		if (isPalindrome) {
				System.out.println (palindrome + "...That is a good palindrome");
		} else {
				System.out.println (palindrome + "...That is not a palindrome");
		} 
	}
}