package euler;

/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

	What is the 10 001st prime number?
 * @author harshshah
 *
 */

public class Problem7 {

	final static int NUMBER= 10001;
	
	public static void main(String[] args) {
		System.out.println(searchPrime(NUMBER));
	}
	
	static long searchPrime(int num){
		long checkedNum = 3;
		int cnt = 1;
		while(true){
			boolean isPrime = true;
			for(long i=2;i<=Math.sqrt(checkedNum);i++){
				if(checkedNum%i==0){ 
					isPrime=false;
					break;
				}
			}
			if(isPrime) {
				cnt++;
			}
			if(cnt==num){
				break;
			}
			checkedNum+=2;
		}
		return checkedNum;
	}

}
