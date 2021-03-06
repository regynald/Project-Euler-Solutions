//Run Time: 48ms
public class p044 {
	public static String run() {
		int result=0,i=1;
		boolean notFound=true;
		while (notFound) {
			i++;
			int n = i * (3 * i - 1) / 2;
			for (int j = i-1; j > 0; j--) {
				int m = j * (3 * j - 1) / 2;
				if (isPentagonal(n - m) && isPentagonal(n + m)) {
					result = n-m;
					notFound = false;
					break;
				}
			}
		}
        return Integer.toString(result);
	}

	private static boolean isPentagonal(int number) {
		double isPent = (Math.sqrt(1 + 24 * number) + 1) / 6;
		return isPent == ((int)isPent);
	}
}
