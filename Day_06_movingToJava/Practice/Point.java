public class Point {
		private int x;
		private int y;
		
		public Point (int x, int y) {
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
	
	public static void main (String[] args) {
	
		Point point = new Point(1,1);
		System.out.println("The point is now at " + point.getX() + "," + point.getY());
		Point remotePoint = new Point(10, 20);
		point.moveTo(remotePoint);
		System.out.println("The point is now at " + point.getX() + "," + point.getY());
	}
}