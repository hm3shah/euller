package euler;

import java.util.Scanner;
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

//600851475143->6857

*/
public class Problem3 {
 
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number: ");
		long i = input.nextLong();
		System.out.println(i);
		
		long j = prime(i);
		System.out.println("Lsrgest prime number is " + j);
		
		
}
	public static long prime(long i) {
		
		for(long j = (long) Math.sqrt(i); j>1; --j) {
			if(i%j==0)
				if(isPrime(j))
					return j;
		}
		return -1;
	}
	
	public static boolean isPrime(long j) {
		for (long k=2;k<=(long) Math.sqrt(j);++k){
			if(j%k==0)
				return false;
		}
		return true;
		
	}
}
