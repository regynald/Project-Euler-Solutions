//Run Time: 65ms
import library.library;

public class p027 {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		int result=0;
		int maxnum=0,maxa=0,maxb=0;
		for(int a=-1000;a<=1000;a++){
				for(int b=-1000;b<=1000;b++){
					int temp = numberOfPrimes(a,b);
					if(temp>maxnum){
						maxnum=temp;
						maxa=a;
						maxb=b;
					}
				}
			}
		result=maxa*maxb;
		System.out.println(result);
		System.out.println(System.currentTimeMillis()-start+"ms");
	}
	private static int numberOfPrimes(int a, int b){
		for (int i = 0; ; i++) {
			int n = i * i + i * a + b;
			if (n < 0 || !library.isPrime(n))
				return i;
		}
	}	
}