//Run Time: 76ms
import regy.library;
import java.util.Arrays;
import java.util.ArrayList;

public class p049 {
	
	static int celing = 10000;
	static boolean[] primes = library.sieveOfEratosthenes(celing-1);
	
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		String result = null;
		for(int num = 1001; num < celing; num+=2) {
			if(primes[num] && (num != 1487 || num != 4817)) {
				ArrayList<Integer> temp = primePermutations(num);
				for(int step = 2; step < celing; step+=2) {
					int x = num + step;
					int y = x + step;
					if(x<celing && y<celing & primes[x] && primes[y] && temp.contains(x)&&temp.contains(y))
						result = "" + num + x + y;
				}
			}
		}
		System.out.println(result);
		System.out.println(System.currentTimeMillis() - start + "ms");
	}
	
	private static boolean isPermutation(int i, int j) {
		char[] a = Integer.toString(i).toCharArray();
		char[] b = Integer.toString(j).toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		if(Arrays.equals(a, b))
			return true;
		return false;
	}
	
	private static ArrayList<Integer> primePermutations(int n) {
		ArrayList<Integer> perms = new ArrayList<Integer>();
		String num = Integer.toString(n);
		int[] temp = new int[num.length()];
		for (int i = 0; i < num.length(); i++)
		{
		    temp[i] = num.charAt(i) - '0';
		}
		while(library.hasNextPermutation(temp)) {
			StringBuilder strNum = new StringBuilder();
			for (int i : temp) 
			     strNum.append(i);
			int temp2 = Integer.parseInt(strNum.toString());
			if(primes[temp2] && isPermutation(n,temp2)) {
				perms.add(temp2);
			}
		}
		return perms;
	}
}
