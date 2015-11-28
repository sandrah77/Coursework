/* 
Create a class with a method pow that takes two integers (base and exponent) and 
calculates the power, e.g. pow(2,3) calculates 23.
Is it easy to do this both iteratively and recursively?
*/


public class Ex05_power{

	public static void main (String[] args){

	// Create a new object of the class
	Ex05_power t = new Ex05_power();
	System.out.println (t.pow(2,20));

	}
	// Recursively call the method.
	public int pow(int base, int exponent){
		if (base == 0) { 
			return 0;
		}
		
		if (exponent == 0) {
			return 1;
		} 

		if (base > 0 && exponent > 0) {
			return base * pow(base, exponent-1);
		}
		
		else {
			return -1;
		}
	}
}
