/* Modify your former program so that it outputs ”Yes” when the numbers are consecutive, 
regardless of whether they go up or down. For example, both ”2,3,4,5,6,-1” and ”10,9,8,7,-1” 
should now result in ”Yes”.
*/

print "Give me a number: "
String str = System.console().readLine();
int number1 = Integer.parseInt(str);
int number2 = 0;
boolean consecutive = true;
while (number2 != -1) {
	print "Give me another number: "
	str = System.console().readLine();
	number2 = Integer.parseInt(str);
	if (number2 == -1) {
		break;
	}
	if (number2 - number1 != 1) { 
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