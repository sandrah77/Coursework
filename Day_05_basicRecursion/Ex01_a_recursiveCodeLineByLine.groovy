

// Read a number from the user.
System.out.println ("Please enter a number: ");
int x = Integer.parseInt(System.console().readLine());

printNumbers(x);

public void printNumbers(int n) {
	if (n <= 0) {
		return;
	}
	println(n);
	printNumbers(n - 2);
	//printNumbers(n - 3);
	//println(n);
}