import java.util.Scanner;

public class Ex03_aBitMorePracticeWithDoubles {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);
		MortgageCalculator calculator = new MortgageCalculator();

		System.out.println("Please enter the total amount borrowed on your mortgage " +
			" in decimal notation (ie: 95000.50) : ");

		double totalBorrowed = input.nextDouble();

		System.out.println("What is the number of year(s) given to pay the loan: " + 
			" (ie: 5)");

		int numberOfYears = input.nextInt();

		System.out.println("Please enter the interest rate for the loan as a decimal " +
			" percent (ie: 5.42)");

		double interestRate = input.nextDouble();

		calculator.totalAmountDue(totalBorrowed, interestRate);
		calculator.annualAmountDue(numberOfYears);
		calculator.interestFree(totalBorrowed);

		double myTotal = calculator.totalReturn();
		double myAnnualAmount = calculator.annualAmountReturn();
		int myInterestIsPaid = (int) calculator.interestPaid();

		System.out.println ("Your total amount to be paid is: " + myTotal);
		System.out.println ("The amount of money to be paid yearly is: " + myAnnualAmount);
		System.out.println ("The amount of years before all the interest is paid and only" +
		 	" the initial capital remains is: " + myInterestIsPaid);
	}

	public static class MortgageCalculator {
		private double total;
		private double annualAmount;
		private double interestFreeYears;
		private double interestAmount;

			public void totalAmountDue (double amountBorrowed, double interest) {
				amountBorrowed = amountBorrowed * (1 + (interest / 100));  
				total = amountBorrowed;
			}

			public void annualAmountDue (int accumulator) {
				annualAmount += (double) total / accumulator;
			}

			public void interestFree (double amountBorrowed) {
				interestAmount = total - amountBorrowed; 
				interestFreeYears = (int) interestAmount / annualAmount; 
				}

			public double totalReturn() {
				return total;
			}
			
			public double annualAmountReturn() {
				return annualAmount;
			}
			
			public double interestPaid() {
				return interestFreeYears;
			}
	}
}
