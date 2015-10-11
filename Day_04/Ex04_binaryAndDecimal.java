/* Create a program in which you define the following methods:

binary2decimal(String): takes from the user a binary number (with digits 0 and 1) and returns
the corresponding number in decimal (base-10, with digits between 0 and 9). Hint: in the 
same way that you know that 35 = 3 · 101 + 5 · 100, you can find that 100011 = 1 · 25 + 1 · 21 + 1 · 20.

decimal2binary(int): the opposite of the previous one: takes a decimal number and returns 
the corresponding binary number. Hint: instead of multiplying by 2, you will need to divide 
y two this time.

The program must offer a menu to the user with two options. The first one takes a binary 
number from the user and returns the corresponding decimal number. The second one does the 
opposite: takes a decimal number and returns a binary number. The program should use the 
methods defined.

*/ 
/*
public class Ex02_3_pointerArrows {

	public static void main (String[]args) {	

	String requestUser() {
	String result = System.console().readLine();
	return result;
}

	void createUser() {
			String user = requestUser();
			while (!isValidUser(user)) {
				System.out.println("That name is not valid. Please try again.");
				user = requestUser();
			}
			insertUserInDB(user);
		}
	
	void deleteUser() {
		String user = requestUser();
		while (!isValidUser(user)) {
			System.out.println("That name is not valid. Please try again.");
			user = requestUser();
		}
		if (existsInDB(user) {
			deleteUserInDB(user);
		} else {
			System.out.println ("That user does not exist.");
		}
	}
	
	void binary2decimal(String user) {
		// takes from the user a binary number (with digits 0 and 1) and returns the corresponding number
	}
	
	void decimal2binary(int ) {
		// takes a decimal number and returns the corresponding binary one
	}

	boolean existsInDB(String user) {
		// do things with DB that we will cover in later weeks
	}

	boolean isValidUser(String login) {
		boolean loginIsValid = true;
		for (int i = 0; i < login.length(); i++) {
			char c = login.charAt(i);
			if (!Character.isLetter(c) || !Character.isLowerCase(c)) {
				loginIsValid = false;
			}
		}
		return true;
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