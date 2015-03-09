package miscellaneous;

import static org.junit.Assert.*;

import org.junit.Test;
//Given a string write a method that returns a string with all first characters of the word as capital

//"the quick brown fox" -> "The Quick Brown Fox"

public class ToUpperCase {
	public String toUpperCase(String str) {
		//Check if the str is null
		if(str==null) {
			return str;
		}
	    char[] temp = str.toCharArray();
	    StringBuilder upperStr = new StringBuilder();
	    upperStr.append(Character.toUpperCase(temp[0]));
	    for(int i=1;i<temp.length;++i) {
	        if(temp[i-1]==' ') {
	            upperStr.append(Character.toUpperCase(temp[i]));
	        } else {
	            upperStr.append(temp[i]);
	        }
	    }
	    return upperStr.toString();
	}
	
	@Test
	public void testToUpperCase() {
		assertEquals(toUpperCase("the quick brown fox"),"The Quick Brown Fox");
		assertEquals(toUpperCase("the "),"The ");
		assertEquals(toUpperCase(null),null);
	}
}
