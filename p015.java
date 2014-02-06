//Run Time: 1ms
import library.library;
import java.math.BigInteger;

public class p015 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int n=40, r=20;
		System.out.println(combination(n,r));
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	
	public static BigInteger combination(int n, int r) {
		BigInteger ncr = library.factorial(n).divide(library.factorial(r).multiply(library.factorial(n-r)));
		return ncr;
	}
	
}
