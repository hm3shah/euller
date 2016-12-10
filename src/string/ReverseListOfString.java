package string;

import static org.junit.Assert.*;

import java.util.Iterator;
import java.util.Stack;

import org.junit.Test;

/**
 * How do you reverse the words in a string.... 
 * e.g.: input: 'i am a person'... output: 'person a am i'  
 * @author harshshah on Mar 17, 2016 @ 7:10:24 PM
 *
 */

public class ReverseListOfString {

	
	public String reverseString(String s) {
		if(s == null) {
			return s;
		}
		String[] words = s.split("\\s+");
		Stack<String> stack = new Stack<>();
		for(String word: words) {
			stack.add(word.trim());
		}
		Iterator<String> iter = stack.iterator();
		StringBuffer sb = new StringBuffer();
		while(iter.hasNext()) {
			sb.append(stack.pop());
			sb.append(" ");
		}
		sb.delete(sb.length()-1,sb.length());
		return sb.toString();
				
	}
	
	@Test
	public void test(){
		assertEquals(reverseString("HArsh is Great"),"Great is HArsh");
		assertEquals(reverseString("i am a person"),"person a am i");
		
	}
}
