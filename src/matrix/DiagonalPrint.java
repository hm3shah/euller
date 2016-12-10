package matrix;

import org.junit.Test;

/**
 * Input:
 * 1	2 	3
 * 4	5	6
 * 7	8	9
 * 
 * 
 * Output:							
 * 1										00
 * 4	2									10 01
 * 7	5	3								20 11 02	
 * 8	6									21 12
 * 9										22
 * 
 * @author harshshah on Feb 27, 2016 @ 2:09:04 PM
 *
 */

public class DiagonalPrint {

	public void printMatrixDiagonaaly(int[][] a) {
		int rowLen = a.length;
		int colLen = a[0].length;
		int count = rowLen + colLen - 1;
		
//		for(int i=0;i<count; ++i) {
//			
//			for() {
//				
//			}
//			
//			
//			
//			System.out.println();
//		}
	
	for(int d=0; d<= colLen + rowLen-1;d++) {
		for(int i=0;i<=d;i++) {
			if(i<colLen && (d-i)<rowLen)
			System.out.print(a[d-i][i]);
		}
		System.out.println();
	}
		
//		for(int d=colLen + rowLen-1; d>=0 ;d--) {
//			for(int i=d;i>=0;i--) {
//				if(i<colLen && (d-i)<rowLen)
//				System.out.print(a[d-i][i]);
//			}
//			System.out.println();
//		}
	}
	
	@Test
	public void test() {
//		printMatrixDiagonaaly(new int[][]{{1,2,3},{4,5,6},{7,8,9},{10,11,12}});
		printMatrixDiagonaaly(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
//		printMatrixDiagonaaly(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}});}
}
}