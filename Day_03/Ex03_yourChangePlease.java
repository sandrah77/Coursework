import java.util.Scanner;

public class Ex03_yourChangePlease {
	public static void main (String[] args) {
		
		// Read text from the user
		Scanner input = new Scanner(System.in);
		System.out.println ("Please enter the total cost of scanned items for confirmation: ");
		double totalCost = input.nextDouble();
		
		int remainingAmount = (int) totalCost * 100;

		// Find the number of pounds
		int fiftyQuid = remainingAmount / 5000;
		remainingAmount = remainingAmount % 5000;

		int twentyQuid = remainingAmount / 2000;
		remainingAmount = remainingAmount % 2000;

		int tenQuid = remainingAmount / 1000;
		remainingAmount = remainingAmount % 1000;

		int fiveQuid = remainingAmount / 500;
		remainingAmount = remainingAmount % 500;

		int twoQuid = remainingAmount / 200;
		remainingAmount = remainingAmount % 200;

		int oneQuid = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;

		 // Find the number of pence in the remaining amount.
		int fiftyPence = remainingAmount / 50;
		remainingAmount = remainingAmount % 50;

	 	int twentyPence = remainingAmount / 20;
	 	remainingAmount = remainingAmount % 20;

	 	int tenPence = remainingAmount / 10;
	 	remainingAmount = remainingAmount % 10;

	 	int fivePence = remainingAmount / 5;
	 	remainingAmount = remainingAmount % 5;

	 	int twoPence = remainingAmount / 2;
	 	remainingAmount = remainingAmount % 2;

	 	int onePence = remainingAmount;

	 	// Display results
	 	System.out.println("Your total amount is " + totalCost);
	 	System.out.println(" " + fiftyQuid + " £50 note(s)");
		System.out.println(" " + twentyQuid + " £20 note(s)");
		System.out.println(" " + tenQuid + " £10 note(s)");
		System.out.println(" " + fiveQuid + " £5 note(s)");  
		System.out.println(" " + twoQuid + " £2 coin(s)");
	    System.out.println(" " + oneQuid + " £1 coin");
	 	System.out.println(" " + fiftyPence + " .50¢ coin");
	 	System.out.println(" " + twentyPence + " .20¢ coins(s)");
	 	System.out.println(" " + tenPence + " .10¢ coin(s)");
	 	System.out.println(" " + fivePence + " .5¢ coin(s)");
	 	System.out.println(" " + twoPence + " .2¢ coin(s)");
	 	System.out.println(" " + onePence + " .1¢ coin");


	 }
}

	

