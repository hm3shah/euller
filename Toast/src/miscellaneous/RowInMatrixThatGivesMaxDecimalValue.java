package miscellaneous;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import org.junit.Test;

/**
 * 
 * Given 2D Array of only 0s and 1s, Find the row which gives max decimal value.
 * 
 * Input: int array[3][3] = {{0,1,0,}{1,1,0},{1,0,1}}; Output : 2(second
 * row)...decimal value is 6
 * 
 * 
 * 
 * */
public class RowInMatrixThatGivesMaxDecimalValue {

	@Test
	public void test() {
		assertEquals(maxDecimalNumberRow(new int[][] {{1,0,1,1,1},{0,0,1,1,1},{1,1,0,0,0}}), 2);
	}

	private int maxDecimalNumberRow(int[][] array) {
		int rowLen = array.length;
		int colLen = array[0].length;
		int result = 0;
		HashSet<Integer> rows = new HashSet<>();
		List<Integer> tempRowsToRemove;
		for (int c = 0; c < colLen; c++) {
			tempRowsToRemove= new ArrayList<>();
			if (rows.isEmpty()) {
				for (int r = 0; r < rowLen; r++) {
					if (array[r][c] == 1) {
						result = r;
						rows.add(r);
					}
				}
			} else {
				for (Integer r : rows) {
					if (array[r][c] == 1) {
						result = r;
					} else {
						tempRowsToRemove.add(r);
					}
				}
				for(Integer r : tempRowsToRemove) {
					rows.remove(r);
				}
			}
			if (rows.size() == 1) {
				return result;
			}
		}
		if (rows.size() == 1) {
			return result;
		}
		return -1;
	}

}
