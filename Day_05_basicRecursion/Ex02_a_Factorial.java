/*
Write a small program with a method that calculates the factorial of an integer number as 
seen in the notes. Is it easy to do this both iteratively and recursively? Try both ways and
see which is more natural for you. If one takes too long, try the other way.
*/

import java.util.Scanner;


public class Ex02_a_Factorial {
	
	public static void main(String [] args){

		Scanner input = new Scanner (System.in);
		Ex02_a_Factorial t = new Ex02_a_Factorial();
		int number = input.nextInt();

		//t.factorialIterative(number);
		System.out.println("The factorial value is: " + t.factorialRec(number));
	}
////////////////////////////////////////
	public int factorialIterative(int x) {
		int result = 1;

		for (int i = 1; i <= x; i++) {
			result = result * i;
			System.out.println(result);
		}	

		return result;
	}

////////////////////////////////////////
	public int factorialRec(int x) {
		if (x==1)
			return 1;
		else return x * factorialRec(x-1);
	}
}

	/*Scanner input = new Scanner (System.in);
		//Factorials myFacts = new Factorials();

		System.out.println ("Please enter a number to be called iteratively: ");
		int number = input.nextInt();
		//myFacts.factorialIterative(number);
		//myFacts.factorialRecursive(number);
		factorialIterative(number);
		factorialRecursive(number);


		
		int factNums1 = myFacts.factorialIterative(number);
		System.out.println (factNums1);
		int factNums2 = myFacts.factorialRecursive(number);
		System.out.println (factNums2);

	}

	//public static class Factorials {
	//	private int result1;
	//	private int result2;
		int result1;
		int result2;

		public int factorialIterative(int x) {
			for (int result1 = x; result1 > 1; result1++) {
				if (result1 == 1) {
					return 1;
			  } else {
					return result1;
				}
			}
			return 1; 
		}

		public int factorialRecursive(int y) {
				result2 = y;
				if (y == 1) {
					return 1;
				} else {
				result2 = y * factorialIterative(y-1); 
				return result2;
			 }
		}
	  //}
}*/