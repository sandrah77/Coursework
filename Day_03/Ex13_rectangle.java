import java.util.Scanner;

/* Write a program that reads the X and Y coordinates of two points and then 
outputs the area of a rectangle where both points are opposite corners. 
Use the following class to store the data for the points:

class Rectangle { 
		Point upLeft; 
		Point downRight;
		}

Your program should calculate (and write on the screen) the perimeter and area 
of the rectangle.

*/


class Ex13_rectangle {
	
	public static void main (String [] args) {

	Scanner input = new Scanner(System.in);	

double x, y;

// Read first point
System.out.println("Hello! Give me X!");
x = input.nextDouble();
System.out.println("Now give me Y!");
y = input.nextDouble();
Point point1 = new Point();
point1.x = x;
point1.y = y;

// Read second point
System.out.println("Hello! Give me X!");
x = input.nextDouble();
System.out.println("Now give me Y!");
y = input.nextDouble();
Point point2 = new Point();
point2.x = x;
point2.y = y;

// Create Rectangle
Rectangle myRectangle = new Rectangle();
myRectangle.upLeft = point1;
myRectangle.downRight = point2;

// Calculate the perimeter
double width = myRectangle.downRight.x - myRectangle.upLeft.x; 
double height = myRectangle.upLeft.y - myRectangle.downRight.y;
double perimeter = 2 * (width + height);

// Calculate area
double area = width * height;

System.out.println("Perimeter is " + perimeter + ". Area is " + area + ".");
	

	}
}

class Point {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
}