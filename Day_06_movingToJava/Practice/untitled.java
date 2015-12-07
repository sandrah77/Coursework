public class Point {
	private double x;
	private double y;
	public Point (double x, double y) {
		this.x = x;
		this.y = y;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public double moveTo(Point remote) {
		this.x = remote.x;
		this.y = remote.y;
	}
	// more methods here...
	}	
	Point point = new Point(1,1);
	System.out.println("The point is now at " + point.getX() + "," + point.getY());

		}


}