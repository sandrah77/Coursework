String buggyMethod(int n) {
	// changed to less than and equal incase of negative integer
	if (n <= 0) {
		return "";
	}
	return n + " " + buggyMethod(n - 2);
}

// Print statement outside the method
println(buggyMethod(6));