public class Day04_methodsInClasses {
	
	public static void main (String[] args) {
		

	}

public static class UnidimensionalPoint {
		int x;
		int getX() {
			return x;
		}
	void setX (int x) {
		this.x = x;
	}
	UnidimensionalPoint clone() {
		UnidimensionalPoint copy;
		copy = new UnidimensionalPoint();
		copy.setX(x);
		return copy;
	}
}