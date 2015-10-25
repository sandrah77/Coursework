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
	String str = input.nextLine();
	System.out.println ("Please enter the character you would like to look for: ");
	char letter = input.next().charAt(0);
	int loop = 0;

		for (int i = 0; i < str.length(); i++) {
				char e = str.charAt(i);
				if (e == (letter)) {
					loop = loop + 1;  
				}
		}
		System.out.println("We have found your letter " + loop + " times in the text.");
	}	
}


