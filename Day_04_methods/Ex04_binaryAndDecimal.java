/* 
Create a program in which you define the following methods:

power(int, int): Takes a base b and an exponent e from the user, and returns the result of b to the power e.

power2(int): Takes an exponent e from the user and returns the result of 2e. This method must call the previous
one to find out the result.

binary2decimal(String): Takesfromtheuserabinarynumber(withdigits0and1)and returns the corresponding number in 
decimal (base-10, with digits between 0 and 9). Hint: in the same way that you know that 35 = 3·101 + 5·100,
you can find that 100011 = 1·25 + 1·21 + 1·20. This method must call the previous one to find out the result.

decimal2binary(int): The opposite of the previous one: takes a decimal number and returns the corresponding 
binary number. Hint: instead of multiplying by 2, you will need to divide by two this time (the quotients and 
the last remainder will give you the binary number).

The program must offer a menu to the user with two options. The first one takes a binary number from the 
user and returns the corresponding decimal number. The second one does the opposite: takes a decimal number 
and returns a binary number. The program should use the methods defined.

*/ 

public class Ex04_binaryandDecimal{

	public static void main(String[]args){	
	// Remember that anything to the power of 0 is 1...

	public int power(int b, int e) {
		// declared extra variables for brevity
		int modBase = b;
		if (e == 0){
			return 1; 
		}else{
		while (e != 0) {
			modBase *= b;
			e--;
		}
		return modBase;
	}

	public int power2(int e){
		if (e == 0){
			return 1; 
		}else{
		int deuces = 2;
		while (e != 0) {
			dueces *= deuces;
			e--; 
		}
		return dueces;
	// must call the previous method to find the result??
	}
	
	public double binary2decimal(String binaryNum) {
		int binLength = binaryNum.length();
		for (int i=0;i<binaryNum.length();i++){
			
			int convert = Integer.parseString(binaryNum);

		}

		return decimalNum;
		// takes from the user a binary number (with digits 0 and 1) and returns the corresponding number
	}
	
	void int decimal2binary(int ) {
		// takes a decimal number and returns the corresponding binary one
	}

	
	boolean running = true;
		while (running) {
			println "What would you like to do?";
			println "1 - Enter a new user";
			println "2 - Delete a user";
			println "0 - Exit";
			print "> ";
		}
		
		String str = System.console().readLine();
		int option = Integer.parseInt(str);
		
		switch (option) {
			case 0: running = false;
		break;
			case 1: createUser();
		break;
			case 2: deleteUser();
		break;
			default: println "Invalid option. Please try again."
	  }
	}
  }
}