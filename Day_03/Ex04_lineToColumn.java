/* 
Write a program that reads some text from the user and then 
writes the same text on screen, but each letter on a different line.
Now modify your program to write each word (as defined by spaces) 
rather than letter on a different line.
*/

import java.util.Scanner;

public class Ex04_lineToColumn {
	
	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println ("Please enter your string of text: ");
	String reader = input.nextLine();
	for (int x = 0; x < reader.length(); x++) {
		System.out.println(reader.charAt(x));
	}
  }
}

