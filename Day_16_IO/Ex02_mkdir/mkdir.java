/* 
Write a program that takes a name from the user at the command line and 
creates a directory with that name. Remember that the only argument of method 
ain is an array of Strings, each of them an argument written after the name of
the class. For example, if you write java myClass this That 0, the elements in 
args will be three strings of values “this”, “That”, and “0”.
*/

public class mkdir {
	public static void main (String[] args) {
		System.out.println ("Please enter the class name with something " + 
			" following to be printed from the command line: ");

		String args = nextLine();
		System.out.println (args); 
	}

}