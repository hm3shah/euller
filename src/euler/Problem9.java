package euler;

/**
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,

a^2 + b^2 = c^2
For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
 * @author harshshah
 *
 */

public class Problem9 {

	public static void main(String[] args) {
		
		
		
		for(int c=1000;c>0;c--) {
			for(int b=c-1;b>0;b--) {
				for(int a=b-1;a>0;a--){
					if(a+b+c==1000 && (a*a)+(b*b)==(c*c)) {
						System.out.println(a + " " + b + " " + c +" ");
						System.out.println(a*b*c);
					}
				}
			}
		}
	}
}
