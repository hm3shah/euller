package interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

public class ReverseArrayByGroupSize {
	
	@Test
	public void testFunction() {
		reverseArrayByGroupSize(new Integer[]{1,2,3,4,5,6,7,8,9,10,11,12},4);
	}
	
	public int[] reverseArrayByGroupSize(Integer[] array, int groupSize) {
		if(array==null) {
			return null;
		}
		List<Integer> a = new ArrayList<Integer>(Arrays.asList(array));
		List<Integer> b = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		//arraySize=9;
		//groupSize=3;
		
		
		int count = (int) Math.floor(a.size()/(double)groupSize);
		for(int i=0; i< count; ++i) {
			b = a.subList(i*groupSize, (i+1)*groupSize);
			Collections.reverse(b);
			result.addAll(b);
		}
		
		int left = a.size()%groupSize;
		for(int i=0; i<left;i++) {
			result.add(a.get(a.size()-1-i));
		}
		
		for(Integer c : result) {
			System.out.println(c);
		}
		return null;
	}

}
