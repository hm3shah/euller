package hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HashMapIterating {

	public static void main(String[] args) {
		HashMap<Integer,Integer> temp = new HashMap<>();
		temp.put(1, 1);
		temp.put(2, 2);
		
		for (Integer t : temp.keySet()) {
			System.out.println(temp.get(t));
		}
		
		int[] a = new int[1];
		System.out.println(a.length);
		
		List<Integer> n = new ArrayList<>();
		System.out.println(n.size());
	}
}
