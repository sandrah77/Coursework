/* 
The greatest common divisor (GCD) of two natural numbers is the largest natural number that
can exactly divide them both. For example, the GCD of 12 and 15 is 3, the GCD of 12 and 6 
is 6 (because both divisons 12/6 and 6/6 are exact), and the greatest common divisor of 14 
and 27 is 1.

Finding the GCD of two numbers has a lot of applications in cryptography and information 
security. We can find the GCD of two numbers by finding all of them and them matching the 
lists for both numbers, but there is a fastest way. The GCD has the property that

	ifp > q, thengcd(p,q) = gcd(q,p mod q)

where mod represents the modulo operator (i.e. %). Therefore, given two numbers p and q, 
where p > q, if q is a divisor of p, then q is the GCD of both number; otherwise, 
we can apply the property above to find a pair of smaller numbers with the same GCD.

Write a program that finds the GCD of two natural numbers recursively using this property.

(Hint: your base case is that if q is a divisor of p, then q is the GCD of p and q.)
*/

public class Ex06_greatestCommonDivisor{
	
	public static void main (String[] args){

	Ex06_greatestCommonDivisor t = new Ex06_greatestCommonDivisor();
	System.out.println (t.gcd(15, 12));
	
	}

	public int gcd(int numerator, int denominator) {
		
		if (numerator % denominator == 0) {
			return denominator;
		}
		
		if (numerator > denominator){
			return gcd(denominator, numerator % denominator);
		} 
			else return 0; 
		}
	}
