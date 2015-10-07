/* Write a program that requests two numbers from the user and then 
outputs the quotient and the remainder, e.g. if the user enters 
7 and 3, your program should ouput something like “7 divided by 3 is 2,
remainder 1”. You cannot use the “/” or “%” operators.
*/


print "Please enter the number you would like divided: ";
String str1 = System.console().readLine();
int x = Integer.parseInt(str1);
println "Please enter the second integer: "
String str2 = System.console().readLine();
int y =  Integer.parseInt(str2);
int subtractor = x; 
int quotient = 0;

while (subtractor >= y) {
	subtractor = subtractor - y; 
	quotient++
	
}
 println x + " divided by " + y + " is " + quotient + ", remainder " + subtractor;
