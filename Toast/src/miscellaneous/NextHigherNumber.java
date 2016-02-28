package miscellaneous;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

import org.junit.Test;

public class NextHigherNumber {
	
	@Test
	public void testNextHigherNumber() {
		assertEquals(nextHigherNumber(15432),21345); //2134 -> 2143 -> 2314 ->2341 ->2413
		assertEquals(nextHigherNumber(2134),2143); //2134 -> 2143 -> 2314 ->2341 ->2413
		assertEquals(nextHigherNumber(2143),2314); //2134 -> 2143 -> 2314 ->2341 ->2413
		assertEquals(nextHigherNumber(2314),2341); //2134 -> 2143 -> 2314 ->2341 ->2413
		assertEquals(nextHigherNumber(2341),2413); //2134 -> 2143 -> 2314 ->2341 ->2413
		assertEquals(nextHigherNumber(2431),3124); //2134 -> 2143 -> 2314 ->2341 ->2413

	}

	private int nextHigherNumber(int i) {

		String num = String.valueOf(i);
		char[] result = num.toCharArray();
		char[] c = num.toCharArray();
		Arrays.sort(c);
		int biggest = num.indexOf(c[c.length-1]);
		char[] temp = Arrays.copyOfRange(result, biggest-1, result.length);
		Arrays.sort(temp);
		int swap=0;
		for(int j=0;j<temp.length;j++) {
			if(temp[j]>result[biggest-1]){
				swap=j;
				break;
			}
		}
		swap = num.indexOf(temp[swap]);
		swap(result,biggest-1,swap);
		System.out.println();
		char[] tobeSorted = Arrays.copyOfRange(result, biggest,result.length);
		Arrays.sort(tobeSorted);
		for(int j=biggest, k=0;j<result.length; ++j,++k) {
			result[j]=tobeSorted[k];
		}
		String r = new String(result);
		return Integer.valueOf(r);
	}

	private void swap(char[] c, int i, int swap) {
		char temp = c[i];
		c[i] = c [swap];
		c[swap] = temp;
	}
}


/**
 * 
 * Given 2D Array of only 0s and 1s, Find the row which gives max decimal value. 

Input: int array[3][3] = {{0,1,0,}{1,1,0},{1,0,1}}; 
Output : 2(second row)...decimal value is 6


 * 
 * 
 * */
