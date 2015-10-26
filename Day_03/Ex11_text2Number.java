/* 
Write a program that reads a number with commas and decimal dots (such as “23,419.34”) 
and then prints a number that is half of it. Do not use Double parseDouble(). If you 
were writing a simple spreadsheet, you could use this code to parse the input in the 
cells.
*/
import java.util.Scanner;


public class Ex11_text2Number {
	public static void main (String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println ("Please enter your number with commas/decimal dots: ");
		String str = input.nextLine();
		str = str.replaceAll("\\D+","");
		System.out.println (str);
		int number = (int) str / 100;

	}
}