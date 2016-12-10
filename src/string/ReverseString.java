package string;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Test;

public class ReverseString {

	@Test
	public void testReverseGivenString() {
		assertTrue(true);
		assertEquals(reverseGivenString("abcd"), "dcba");
		assertEquals(reverseGivenString(""), "");
		assertEquals(reverseGivenString(null), null);
		assertEquals(reverseGivenStringUsingApi("abcd"), "dcba");
		assertEquals(reverseGivenStringUsingApi(""), "");
		assertEquals(reverseGivenStringUsingApi(null), null);
		assertEquals(reverseStringRecur("abcd"), "dcba");
		assertEquals(reverseStringRecur(""), "");
		assertEquals(reverseStringRecur(null), null);

	}

	public String reverseGivenString(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder reverseStr = new StringBuilder();
		int length = str.length();

		for (int i = length - 1; i >= 0; --i) {
			reverseStr.append(str.charAt(i));
		}
		return reverseStr.toString();
	}

	public String reverseGivenStringUsingApi(String str) {
		if (str == null) {
			return null;
		}
		StringBuilder sb = new StringBuilder(str);
		return sb.reverse().toString();
	}
	public String reverseStringRecur(String str) {
		if (str == null) {
			return null;
		}
		if(str.length()<2) {
			return str;
		}
		return reverseStringRecur(str.substring(1)) + str.charAt(0);
	}
	
	public static void main(String[] args) {
		ReverseString reverseString = new ReverseString();
		String input = new Scanner(System.in).next();
		System.out.println(reverseString.reverseGivenString(input));
	}
}
