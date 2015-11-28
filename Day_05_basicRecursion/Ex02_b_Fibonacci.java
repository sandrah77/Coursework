/* 
Write a small program with a method that calculates the nth element of the Fibonacci 
sequence as seen in the notes. Is it easy to do this both iteratively and recursively? 
Try both ways and see which is more natural for you. If one takes too long, try the other way.
When doing it recursively, do it with and without memoization. Compare the time that is needed 
in each case to find F(40) or F(45).
*/

import java.util.Scanner;

public class Ex02_b_Fibonacci{
	
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);	
		Ex02_b_Fibonacci fib = new Ex02_b_Fibonacci();
		System.out.println("Please enter a fib. sequence to be printed");
		int x = input.nextInt();
	
		System.out.println(fib.fibSequenceIter(x));
	}
	
	/*public int fibSequenceRecur(int n){
		if (n < 3){
			return 1;
	  	} else {
			int result = fib(n-1) + fib(n-2); // method calls itself (recursive)
			return result;
		}
	}
	*/
	public int fibSequenceIter(int n){
		int x = 1;
		int y = 1;
		int result = 0;
		if (n < 3) { 
			return 1;
		}else{ 
			for (int i = 3; i <= n; i++){ // method loops through each instance (iterative)   
				result = x + y;
				x = y;
				y = result;
			}	
			return result;
		}
	}
}	
	/*
	public int sequence(int num) {
		do () {
			System.out.println ()
		 {
		}


		}

	}
*/


