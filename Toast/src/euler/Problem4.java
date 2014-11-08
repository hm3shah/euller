package euler;

import java.util.ArrayList;
import java.util.List;

/*A palindromic number reads the same both ways. The largest palindrome made from 
the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
*/
public class Problem4 {
	public static void main(String[] args) {
		boolean done =false;
		
		long prod = 0 ;
		long biggest= 0;
		int count = 0;
		
		long sTime = System.nanoTime();
		for (int i=100; i < 1000; ++i) {
			for(int j = i; j<1000; ++j) {
				prod = j*i;
				count++; //405450
				if(pali(prod)){
					if(prod > biggest)
						biggest = prod;
				}
			}
		}
		/*for(int i=999;i >99;--i) {
			for (int j= 999; j >= i; --j) {
				prod = i*j;
				if (prod > biggest) {
					if(pali(prod)) {
						count++;	//405450 //3225 //2
						biggest=prod;
					}
				}
			}
				
		}
		*/long eTime = System.nanoTime();
		System.out.println(count);
		System.out.println("The palindorome product is: " + biggest);
		System.out.println("Time: " + (eTime-sTime)/1000000000.0); //Time: 0.01528 //Time: 0.016355
	}
	
	
	public static long prod(long i, long j) {
		return i*j;
	}

	public static boolean pali(long prod) {
		long temp=prod;
		long rev=0;
		int i=0;
		while(temp>0) {
			i = (int) (temp % 10);
			temp = temp / 10;
			rev = rev*10 + i;
		}
		if(rev==prod)
			return true;
		else
			return false;
	}
}
