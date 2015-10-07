double x, y;

// Read first point
println("Hello! Give me X!");
x = readDouble();
println("Now give me Y!");
y = readDouble();
Point point1 = new Point();
point1.x = x;
point1.y = y;

// Read second point
println("Hello! Give me X!");
x = readDouble();
println("Now give me Y!");
y = readDouble();
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

println("Perimeter is " + perimeter + ". Area is " + area + ".");


class Pointer {
	double x;
	double y;
}

class Rectangle {
	Point upLeft;
	Point downRight;
	}