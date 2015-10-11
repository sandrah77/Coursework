/* 
Write a program that reads some text from the user and then says how
many letters ’e’ are there in that text. Then modify the program so
that it reads the text from the user and then asks for a letter. 
The program should then say how many times you can find the letter 
in the text.
*/

import java.util.Scanner;

public class Ex05_countingLetters {
	
	public static void main (String[] args) {


	Scanner input = new Scanner(System.in); 
	System.out.println ("Please enter your string of text: ");
	String reader = input.nextLine();
	System.out.println("Your text has: " + reader.length() + " characters.");
	for (int x = 0; x < reader.length(); x++) {
		System.out.println(reader.charAt(x));


	 }
	 boolean a = containsChar(reader, 'e');

	if (a == true) {
	 	System.out.println("whooooo");
	 }

	int number = numOfChar(reader, 'e');
	
	}
	public static boolean containsChar (String s, char c) {
	 	if (s.length() == 0) { 
	 		return false;
	 	} else {
	 		for (int x = 0; x < s.length(); x++) {
		 		if (s.charAt(x) ==  c) {
		 			return true;
		 		}
		 		else {
		 			return false;
		 		}	
	 		
	 		}
	
	 	}
		public static int numOfChar (String s, char c) {
	 	if (s.length() == 0) { 
	 		return 0;
	 	} else {
	 		int count = 0;
	 		for (int x = 0; x < s.length(); x++) {
		 		if (s.charAt(x) ==  c) {
		 			count++;
		 		}
		 	}
		 	return count;
		} 	
		 		
  }

