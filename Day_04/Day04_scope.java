public class Day04_scope {
	
	public static void main (String[] args) {
		System.out.println ("Hello Stephen, here is your test");
		TestValues point = new TestValues();
		// program execution starts here
		int myNumber = 0;
		System.out.println("Starting program, my number is " + myNumber);
		point.add1000(myNumber); //method call
		System.out.println ("After the method is used, my number is " + myNumber);


	}




public static class TestValues {

	void add1000(int number) {
		System.out.println ("Starting method, parameter is " + number);
		number = number + 500;
		System.out.println ("In the middle of the method, parameter is " + number);
		number = number + 500;
		System.out.println ("Ending method, parameter is " + number);
		}
	}

}