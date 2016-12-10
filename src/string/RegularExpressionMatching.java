package string;

import static org.junit.Assert.*;

import org.junit.Test;

/**
'.' Matches any single character.
'*' Matches zero or more of the preceding element.

The matching should cover the entire input string (not partial).

The function prototype should be:
bool isMatch(const char *s, const char *p)

Some examples:
isMatch("aa","a") return false
isMatch("aa","aa") return true
isMatch("aaa","aa") return false
isMatch("aa", "a*") return true
isMatch("aa", ".*") return true
isMatch("ab", ".*") return true
isMatch("aab", "c*a*b") return true

 * 
 * @author harshshah
 *
 */
public class RegularExpressionMatching {

	@Test
	public void testExpressionMatching() {
		assertTrue(isMatch("aa", "a*"));
		assertTrue(isMatch("aa", ".*"));
	}

	private boolean isMatch(String string, String pattern) {
		
		return false;
	}
}
