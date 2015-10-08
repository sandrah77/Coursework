/* Write a program that asks a number from the user, then says whether the number is prime 
or not. Remember that a number that is divisible by any number apart from 1 and itself is 
prime. You can use the modulo operator (if a % b is zero, then a is divisible by b).
*/

import java.util.Scanner;
import java.lang.Math;

public class Ex04_primeNumbers {
    public static void main(String[] args) {
    
Scanner input = new Scanner(System.in);  
System.out.println("Please enter a number to be tested as a prime number: ");  
String str = input.nextLine();
int x = Integer.parseInt(str);
int y = (int)Math.sqrt(x); //reduce time complexity of the program by finding the HCM
boolean isPrime = true;
while (isPrime && y > 1) {  // testing condition to be evaluated
	if (x % y == 0) {
		isPrime = false;
	} else {
		y--;				// decrementer used to lower square root of tested number
	}
}
if (isPrime) {
   System.out.println(x + " is a prime number."); 
} else {
   System.out.println (x + " is not a prime number.");
}

    }
}