package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IterateMapMethods {

	public static void main(String args[]) {
		Map<Integer,Integer> map = new HashMap<>();
		map.put(1, 1);
		map.put(2, 2);
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println("Key: " + entry.getKey() + " VAlue: " + entry.getValue());
		}
		
		System.out.println("******************");
		
		for(Integer key : map.keySet() ) {
			System.out.println("Key: " + key + " Value: " + map.get(key));
		}
		
		System.out.println("******************");
		
		Iterator<Map.Entry<Integer,Integer>> iter = map.entrySet().iterator();
		
		while(iter.hasNext()) {
			Map.Entry<Integer, Integer> entry = iter.next();
			System.out.println("Key:" + entry.getKey() + " Value: " + entry.getValue() );
		}
	}

}

