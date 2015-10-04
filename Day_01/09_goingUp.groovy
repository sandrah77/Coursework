/* Read an arbitrarily long sequence of positive numbers from the user, 
until -1 is entered. At that point, print ”Yes” if the numbers were 
consecutive and increasing and ”No” otherwise. Sequences ”1,2,3,4,-1” and 
”5,6,7,8,9,10,11,-1” should output ”Yes”, but ”2,3,5,6,7,-1”, ”10,9,8,7,-1”,
and ”1,1,2,3,4,5,-1” should output ”No”.
*/

print "Give me a number: "
String str = System.console().readLine();
int number1 = Integer.parseInt(str);
int number2 = 0;
boolean consecutive = true;
// Assume all numbers are consecutive
// As soon as one is not, that's it (consecutive = false)
while (number2 != -1) {
	print "Give me another number: "
	str = System.console().readLine();
	number2 = Integer.parseInt(str);
	if (number2 == -1) {
		break;
	}
	if (consecutive && (number2 - number1) != 1) { 
		// They are not consecutive
		 consecutive = false;
	}
	number1 = number2;
}
if (consecutive) {
	println "Yes"
} else {
	println "No"
}