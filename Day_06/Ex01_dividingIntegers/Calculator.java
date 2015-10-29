/*
Create a Java class called Calculator. The class should implement the following methods, each of 
them printing the result on the screen.

• add(int, int)
• subtract(int, int)
• multiply(int, int)
• divide(int, int)
• modulus(int, int)

Note that you will will need to cast the parameters into double to perform exact division. 
Write a small Groovy or Java Decaf program that uses all the methods of Calculator.
*/

import java.util.Scanner;

public class Calculator {
		// Perform addition on the given integers.
		public void add(int x, int y) {
			System.out.println ("Addition: ");
			System.out.println (x + y);
		}	
		// Perform subtraction on the given integers.
		public void subtract(int x, int y) {
			System.out.println ("Subtraction: ");
			System.out.println (x - y);
		}
		// Perform multiplication on the given integers.
		public void multiply(int x, int y) {
			System.out.println ("Multiplication: ");
			System.out.println (x * y);
		}
    	// Perform division on the given integers.
		public void divide(int x, int y) {
			System.out.println ("Division: ");
			System.out.println ((double) x / y);
		}
		// Perform modulus on the given integers.
		public void modulus(int x, int y) {
			System.out.println ("Modulus: ");
			System.out.print (x % y);

		}
		
	public static void main (String[] args) {
		private int x = 20;
		private int y = 5;

		Calculator calc = new Calculator();
		calc.add(x, y);
		calc.subtract(x, y);
		calc.multiply(x, y);
		calc.divide(x, y);
		calc.modulus(x, y);

	}
} 