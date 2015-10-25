/*
Write a program that reads three numbers and prints them in order, 
from lowest to highest.
*/

int x = 0;
int[] numbers = new int [3];
System.out.println ("Please enter " + numbers.length + " numbers to be sorted.");
	while (x < 3) {
		System.out.println	("Enter a number: ");
		String str = System.console().readLine();
		numbers[x] = Integer.parseInt(str);
		x++;
	}
	for (int y = 0; y < numbers.length - 1; y++) {
		// find the lowest number in the list, using Selection Sort.
		double currLowNumber = numbers[y]; 
		int currLowIndex = y;

	for (int z = y + 1; z < numbers.length; z++) { 
		if (currLowNumber > numbers[z]) {
           	currLowNumber = numbers[z];
            currLowIndex = z;
		}
	}
	// Swap the index if we have a lower number.
	if (currLowIndex != y) { 
		numbers[currLowIndex] = numbers[y]; 
		numbers[y] = currLowNumber;
		}	
	System.out.println ("Your three sorted numbers from lowest to highest are " + numbers);	  
}



