package euler;

/**
 * 	The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
	Find the sum of all the primes below two million.
 * @author harshshah
 *
 */

public class Problem10 {
	public final static long NUMBER=2000000;
	
	public static void main(String[] args) {
		long sum = 5; //Already added 2 and 3
		for(long i=5;i<NUMBER;++i) {
			if(isPrime(i)) {
				sum+=i;
			}
		}
		System.out.println(sum);
	}

	private static boolean isPrime(long i) {
		boolean isPrime=true;
		if(i%2==0)
			return false;
		for(long j=3;j<=Math.sqrt(i);j+=2) {
			if(i%j==0) {
				isPrime=false;
				break;
			}
		}
		return isPrime;
	}
}
