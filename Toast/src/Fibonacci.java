
public class Fibonacci {

	public static int fib(int i ) {
		/*
		int temp;
		if(i == 0) {
			return 0;
		}
		else if (i ==1) {
			return 1;
			
		}
		else {
			return fib(i-1) + fib(i-2);
			
		}*/
		
		
		
		//0, 1, 1, 2, 3, 5, 8, 13
		int temp[] = new int[i+1];
		
		
		if(i == 0) {
			//temp[0]= 0;
			return 0;
		}
		else if (i ==1) {
			return 1;
			
		}
		else {
			temp[0]= 0;
			temp[1] = 1;
			for(int j=2 ; j <= i; j++) {
				temp[j] = temp[j-1]+ temp[j-2]; 
			}
		}
		
		return temp[i];
		
		
	//	return -1;
		
	}
}
