package interview;

import static org.junit.Assert.*;

import org.junit.Test;
//http://www.programcreek.com/2012/02/java-calculate-square-root-without-using-library-method/
public class SquareRoot {

	public int squareRoot(int i) {
		int sqrt = i/2;
		int temp=0;
		do {
			temp = sqrt;
			sqrt = (temp +(i/sqrt))/2;
		} while ((sqrt - temp) != 0);
			
			return sqrt;
	}
	
	@Test
	public void testSquareRoot() {
		assertEquals(squareRoot(4),2);
	}
	
}
