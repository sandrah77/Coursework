import java.util.Scanner;

class Point {
	
	public static void main (String [] args) {

	Pointer point1 = new Pointer();	
	Pointer point2 = new Pointer();	
	Pointer point3 = new Pointer();	

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
class Pointer  {
	
	double x;
	double y; 
}