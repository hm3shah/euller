package miscellaneous;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

/**
 * Given an array of Strings, return all the group of strings that are anagrams
 * 
 * Note: All input will be in lower or upper case
 * @author harshshah
 *
 */

public class SearchAnagram {
	

	@Test
	public void testAnagramListFromStringArray() {
		assertTrue(true);
		assertEquals(anagramListFromStringArray(new String[]{"Aabc","abac","aa"}),new ArrayList<String>(){{
			add("Aabc");
			add("abac");
			
		}});
		assertEquals(anagramListFromStringArray(new String[]{"Aabc","aBac","aaCb"}),new LinkedList<String>(){{
			add("Aabc");
			add("aBac");
			add("aaCb");
			
		}});
		assertEquals(anagramListFromStringArray(new String[]{"aabc","xyz"}),new ArrayList<String>());
				
		
	}
	
	
	public List<String> anagramListFromStringArray(String[] strs) {
		Set<String> resultSet = new LinkedHashSet<>();
		List<String> result = new ArrayList<>();
		Map<String,String> stringMap = new HashMap<>();
		int length = strs.length;
		for(int i=0; i<length; ++i) {
			char[] temp = strs[i].toLowerCase().toCharArray();
			Arrays.sort(temp);
			String a = new String (temp);
			if(stringMap.containsKey(a)) {
				resultSet.add(stringMap.get(a));
				resultSet.add(strs[i]);
			} else {
				stringMap.put(a, strs[i]);
			}
		}
		result.addAll(resultSet);
		return result;
	}

}
