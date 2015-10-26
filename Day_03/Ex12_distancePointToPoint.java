/* Write a program that reads the X and Y coordinates of three points and then outputs which 
of the three are closer. Use the following class to store the data for the points:
=
class Point { 
	double x;
	double y; 
}
*/


import java.util.Scanner;

class Ex12_distancePointToPoint {
	
	public static void main (String [] args) {

	Point point1 = new Point();	
	Point point2 = new Point();	
	Point point3 = new Point();	

	Scanner input = new Scanner(System.in);


		System.out.println("Please enter x coordinate: ");
		point1.x = input.nextDouble();
		System.out.println("Please enter y coordinate: ");
		point1.y = input.nextDouble();
		
		System.out.println("Please enter x coordinate: ");
		point2.x = input.nextDouble();
		System.out.println("Please enter y coordinate: ");
		point2.y = input.nextDouble();
		
		System.out.println("Please enter x coordinate: ");
		point3.x = input.nextDouble();
		System.out.println("Please enter y coordinate: ");
		point3.y = input.nextDouble();
		
		System.out.println (point1.x, point1.y);
			System.out.println (point2.x, point2.y);
				System.out.println (point3.x, point3.y);
		}		
	}
class Point  {
	
	double x;
	double y; 

	public storeX (double xCoord, double yCoord ) {
		x = xCoord;
		y = yCoord;
		
		return x;

	}

}
