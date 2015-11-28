/* Make a class that implements a method that reads a list of marks between 0 and 100 from 
the user, one per line, and stops when the user introduces a -1. The program should output 
at the end (and only at the end) how many marks there were in total, how many were 
distinctions (70–100), how many were passes (50–69), how many failed (0–49), and how many 
were invalid (e.g. 150 or -3). Use readLine() exactly once. The output may look similar to 
this example:

Input a mark: 13
Input a mark: 45
Input a mark: 63
Input a mark: 73
Input a mark: 101
Input a mark: 45
Input a mark: 18
Input a mark: 92
Input a mark: -1

There are 7 students: 2 distinctions, 1 pass, 4 fails (plus 1 invalid).

*/

import java.util.Scanner;

public class Marks {
	
	private int distinctions;
	private int passes;
	private int fails;
	private int invalid;

	Scanner input = new Scanner(System.in);



	public void tallyMarks() {
		System.out.println ("Please input a mark: ");
		System.out.println ("Enter numbers in an integer format and press -1 to exit");
		String getString = ""; 
		do{
			getString = input.nextLine();
			int value = Integer.parseInt(getString);
			if (value <= 49 && value >= 0){
				fails++;
			}else if(value <= 69){
				passes++;
			}else if(value <= 100){
				distinctions++;
			}else{
				invalid++;
			} 
		} while(!getString.equals("-1"));
		System.out.println("DISTINCTIONS: " + distinctions);
		System.out.println("PASSES: " + passes);
		System.out.println("FAILS: " + fails);
		System.out.println("INVALID: " + invalid);
	}

	public static void main(String[] args) {
		Marks myMarks = new Marks();
		myMarks.launch();
	}

	public void launch() {
		Marks marks2 = new Marks();
		marks2.tallyMarks();
	}

	
}