package interview;

import static org.junit.Assert.assertEquals;

import java.util.LinkedHashMap;
import java.util.Map;

import org.junit.Test;

public class FirstNonRepeatedCharacter {

	
	@Test
	public void testFunction() {
		String s ="Salesforce is best compnany to work for l i b.";
		assertEquals(findFirstNonRepeatedCharacter(s),new Character('m'));
				
	}

	private Character findFirstNonRepeatedCharacter(String s) {
		if(s == null) {
			return null;
		}
		char[] c = s.toLowerCase().toCharArray();
		Map<Character,Integer> map = new LinkedHashMap<>();
		for (char a : c) {
			if(map.containsKey(a)) {
				map.put(a, map.get(a)+1);
			} else {
				map.put(a, 1);
			}
		}
		
		for(Character b : map.keySet()) {
			if(map.get(b) == 1) {
				return b;
			}
		}
		return null;
	}
}
