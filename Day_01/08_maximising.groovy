/* 
Write a program that read a (arbitrarily long) sequence of positive 
numbers. The sequence is ended when the users enters “-1”. At that point, 
the program must output the highest number in the sequence.
*/

int highest = 0;
int x;
boolean positive = true;
System.out.println "Please enter some positive numbers (enter -1 to exit).";
// Enter numbers until the user inputs -1
while (x != -1) {
		print "Enter a positive number: "
		String input = System.console().readLine();
		x = Integer.parseInt(input);
	if (x == -1) {
		println "The highest positive number entered was " + highest;
		break;
	}	
	// test for even and highest number.
	if ((x % 2) == 0) {
		println "Thanks for the positive digit dude!"
		if (x >= highest) {
			highest = x;
        }
    }  
	// test for an odd number 
	if ((x % 2) != 0) {
		println "That doesn't appear to be a positive whole number";
  	}
}  