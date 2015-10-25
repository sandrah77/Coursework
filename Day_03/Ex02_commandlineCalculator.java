import java.util.Scanner;

/* Write a program that reads a text representing a mathematical 
operation (one of the four basic ones) with two operands, and then 
execute it. For example, if the user enters “3/5” the program 
outputs “0.6”; if the user enters “23 * 4” the program outputs “92”.
*/

public class Ex02_commandlineCalculator {
	public static void main (String[] args) {
		// Check to make sure the user is passing the correct length
		// ie: 3 / 4 on the command line is not to exceed the length of 3.
		if (args.length != 3) {
			System.out.println("Please enter the classname, followed" +
				" by your 1st integer, operator & 2nd integer " +
				 "ie:'java Ex02_commandlineCalculator 5 + 3'");
			System.exit(0); // Enter 0 to exit the invalid entry  
		}

		for (int x = 0; x < args.length; x++) {
			System.out.println(args[x]);
		}

		// Users input which will be stored in the mains array.
		int result = 0; 

		// Determine the operator which will be at the 0th (only) position.
		// break the loop once a selection is made.
		// Using '.' to replace the '*' symbol for brevity with command line syntax.
		switch (args[1].charAt(0)) {
			case '+': result = Integer.parseInt(args[0]) +
							   Integer.parseInt(args[2]);
					break; 
			case '-': result = Integer.parseInt(args[0]) -
							   Integer.parseInt(args[2]);
					break;
			case '.': result = Integer.parseInt(args[0]) *
							   Integer.parseInt(args[2]);
					break;
			case '/': result = Integer.parseInt(args[0]) /
							   Integer.parseInt(args[2]); 
		}

		// Print the computation on the console.
		System.out.println("Number " + args[0] + ' ' + args[1] + ' ' + args[2] + 
			" = " + result);
	}

}

