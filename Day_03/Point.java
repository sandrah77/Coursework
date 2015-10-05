import java.util.Scanner;

class Point {
	
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
		
		System.out.println (point1);
			System.out.println (point2);
				System.out.println (point3);
		}		
	}
class Pointer  {
	
	double x;
	double y; 
}