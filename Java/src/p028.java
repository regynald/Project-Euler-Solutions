//Run Time: 0ms
public class p028 {
	public static String run() {
		int result = 1001*1001;
		int counter = 0, i = 1000,num = 1001*1001;
		do{
			num-=i;
			result+=num;
			counter++;
			if(counter == 4){
				counter=0;
				i-=2;
			}
		}while(i>0&&counter<4);
        return Integer.toString(result);
	}

}
