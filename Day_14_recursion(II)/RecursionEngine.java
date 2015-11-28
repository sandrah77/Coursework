
public class RecursionEngine {
	public static void main (String[] args) {

Recursion start = new Recursion();
start.fib(5);
start.initPrecalculatedArray(4);

}
// arrays are 0-based, so F(1) is stored at posittion 0, etc.
public static class Recursion {
	private int[] precalculated = null;

	public int fib(int n){
		if (precalculated == null) {
			initPrecalculatedArray(n);
		}
		if (precalculated[n-1] != -1) {
			return precalculated [n-1];
		} else {
			int result = fib(n-1) + fib(n-2);
			precalculated[n-1] = result;
			return result;
		}
	}

	private void initPrecalculatedArray(int size) {
		precalculated = new int[size];
		for (int i = 0; i < precalculated.length; i++) {
			precalculated[i] = -1; // to indicate "not calculated yet"
		}
		precalculated[0] = 1; // F(1)
		precalculated[1] = 1; // F(2)
	}


	/*private String doggyMethod(int n) {
			String result = doggyMethod(n-3) + n + doggyMethod(n-2);
			if (n <= 0) {
				return "";
			}
			return result;
		*/
		
	}
}