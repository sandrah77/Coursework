import java.util.Scanner;

public class Ex01_calculator {
public static void main (String[] args) {
	
	
	Scanner input = new Scanner(System.in);
	System.out.println ("Please enter two numbers you would like to perform arithmetic... ");
	System.out.println ("Number 1: ");
	double num1 = input.nextDouble();
	System.out.println ("Number 2: ");
	double num2 = input.nextDouble();
	
	System.out.println("Enter-- 1: Addition, 2: Subtraction, 3: Multiplication, 4: Division");
	int selection = input.nextInt();
	
	switch (selection) {
	
	case 1: System.out.println (num1 + " + " + num2 + " = " + (num1 + num2));
		break;
	case 2: System.out.println (num1 + " - " + num2 + " = " + (num1 - num2));
		break;
	case 3: System.out.println (num1 + " x " + num2 + " = " + (num1 * num2));
		break;
	case 4: System.out.println (num1 + " / " + num2 + " = " + (num1 / num2));
		break;
	
		}
	}
}
	