/* The following piece of code reads a string of text from the command line and
then parses the numbers to an Integer. It then uses a while loop to 
iterate through a series of numbers the user enters. If the number is 0, the code 
completes with the println statement. If the user enters a number that is not 1 then it 
will echo the number back (print twice). After entering up to 10, the println statment gets
written to the console: "finished".
*/

String str = System.console().readLine();
int i = Integer.parseInt(str);


while (i < 10) {
	i++;
	String str2 = System.console().readLine();
	int j = Integer.parseInt(str2);
	if (j == 0) {
		break;
	} else if (j != 1) {
		println j;
	}
}

System.out.println("finished");