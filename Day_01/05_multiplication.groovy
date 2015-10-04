/* Write a program that requests two numbers from the user and then outputs its 
product. You cannot use the “*” operator.
*/

println "Please enter a positive integer to be multiplied by another: "
String str1 = System.console().readLine();
int x = Integer.parseInt(str1);
println "Please enter the second integer: "
String str2 = System.console().readLine();
int y =  Integer.parseInt(str2);
int counter = 0;
int answer = 0;
while (counter < y) {
	answer += x;
	counter++;
}
println answer
