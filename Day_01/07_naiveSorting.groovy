/*
Write a program that reads three numbers and prints them in order, 
from lowest to highest.
*/

int temp;
int[] numbers = new int [3];
println "Please enter " + numbers.length + " numbers to be sorted.";
for (int x = 0; x < numbers.length - 1; x++) {
	// find the lowest number in the list, using Selection Sort.

	println	"Enter a number: "
	String str = System.console().readLine();
	numbers[x] = Integer.parseInt(str);
		
		if (numbers[2] < numbers[1]) {
		temp = numbers[2];
		numbers[2] = numbers[1];
		numbers[1] = temp;
		}
		if (numbers[1] < number[0]) {
			temp = numbers[1];
			numbers[1] = numbers[0];
			numbers[0] = temp;
		}
		if (numbers[0] > number[2]) {
			temp = numbers[0];
			numbers[0] = numbers[2];
			numbers[2] = temp;
		}
		println (numbers[x])
}		
