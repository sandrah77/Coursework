/* 
Write a program that reads a text and then writes on the screen a palindrome by writing
the same text followed by the same text in reversed order. For example, if the user 
enters the text “It was a dark and stormy night” the program must output “It was a 
dark and stormy nightthgin ymrots dna krad a saw tI”.
*/

import java.util.Scanner;	

public class Ex09_palindromeCreator {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println ("Please enter a string to be converted to a palindrome: ");
		String palindrome = input.nextLine();
		String reversedPalindrome = new StringBuilder(palindrome).reverse().toString();
		System.out.println (palindrome + reversedPalindrome);
	}
}