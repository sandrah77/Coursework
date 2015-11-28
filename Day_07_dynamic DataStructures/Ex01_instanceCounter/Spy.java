/* 
Complete the example given in the notes with a class called Spy. 
Your class must have:

• one and only one static variable, and int called spyCount.

• an instance variable of type int for the spy’s ID.

• a constructor method that receives the ID of the spy as an argument,
 increases spyCount(int) by one, and prints on the screen the ID of 
 his spy plus the total number of spies so far.

• a die() method that prints on the screen “Spy XX has been detected
 and eliminated” (where XX is the spy’s ID), decrements the spy 
 counter and prints on the screen the total number of spies so far.

• a main method in which several objects of class Spy are created 
and some of them killed (their method die() is called).
Observe how the static variable is accessed by different objects 
both to increment and to decrement it.
*/

public class Spy{

	private static int spyCount = 0;
	private int spyID;

	public Spy(int n){
		this.spyID = n;
		spyCount++;
		System.out.println("The number of spies is " + spyCount);
	}

	public void die(){
		System.out.println("Spy number " + this.spyID + " has been eliminated");
		spyCount--;
		System.out.println("The number of spies is " + spyCount);
	}

	public static void main(String[] args){
		Spy bond = new Spy(70);
		Spy katzenjammer = new Spy(71);
		Spy farmer = new Spy(72);
		bond.die();
		Spy mySpy = new Spy(73);
	}
}