package miscellaneous;

import static org.junit.Assert.*;

import org.junit.Test;

public class LongestPalindrome {

	@Test
	public void testLongestPalindromeBruteForce() {
		assertEquals(longestPalindromeBruteForce("abac"),"aba");
		assertEquals(longestPalindromeBruteForce("cabac"),"cabac");
		assertEquals(longestPalindromeBruteForce("caba"),"aba");
		assertEquals(longestPalindromeBruteForce("abcd"),"");
		assertEquals(longestPalindromeBruteForce("abacdfgdcaba"),"aba");
		assertEquals(longestPalindromeBruteForce("geeksskeeg"),"geeksskeeg");
	}
	
	@Test
	public void testLongestPalindromeDP() {
		assertTrue(true);
		assertEquals(longestPalindromeDP("abac"),"aba");
		assertEquals(longestPalindromeDP("cabac"),"cabac");
		assertEquals(longestPalindromeDP("caba"),"aba");
		assertEquals(longestPalindromeDP("abcd"),"");
		assertEquals(longestPalindromeDP("abacdfgdcaba"),"aba");
		assertEquals(longestPalindromeDP("geeksskeeg"),"geeksskeeg");
	}
	
	@Test
	public void testLongestPalindromeOther() {
		assertTrue(true);
		assertEquals(longestPalindromeOther("abac"),"aba");
		assertEquals(longestPalindromeOther("cabac"),"cabac");
		assertEquals(longestPalindromeOther("caba"),"aba");
		assertEquals(longestPalindromeOther("abcd"),"");
		assertEquals(longestPalindromeOther("abacdfgdcaba"),"aba");
		assertEquals(longestPalindromeOther("geeksskeeg"),"geeksskeeg");

	}
	
	public String longestPalindromeBruteForce(String string) {
		int longest=0;
		String longestPali="";
		for(int i = string.length(); i >=0 ; --i) {
			for(int j=0; j < i-1; ++j) {
				String temp = string.substring(j,i);
				String reverseTemp =	new StringBuffer(temp).reverse().toString();
				if(temp.equals(reverseTemp) && temp.length() > longest) {
					longest = temp.length();
					longestPali = temp;
				}
			}
		}
		return longestPali;
	}
	
	public String longestPalindromeDP(String string) {
		int length = string.length();
		int maxLength=0;
		int longestBegin=0;
		int[][] table = new int[length][length];
		
		for(int i=0; i < length; ++i) {
			table[i][i]=1;
		}
		
		for(int i=0; i < length-1; ++i) {
			if(string.charAt(i)==string.charAt(i+1)) {
				table[i][i+1]=1;
				maxLength=2;
				longestBegin=i;
				
			}
		}
		
		for(int i=3; i <= length; ++i) {
			for(int j =0; j < length-i+1; ++j ) {
				int k = j+i-1;
				if(table[j+1][k-1]==1 && string.charAt(j)==string.charAt(k)) {
					table[j][k]=1;
					maxLength=i;
					longestBegin=j;
				}
			}
		}
		return string.substring(longestBegin,longestBegin+maxLength);
	}
	
	public String longestPalindromeOther (String string) {
	//	String longestPalindrome = string.substring(0,1);
		String longestPalindrome = "";
		int length = string.length();
		for(int i =0; i < length; ++i) {
			String expandedOdd = expandAroundcentre(string,i,i);
			if (expandedOdd.length() > longestPalindrome.length()) {
				longestPalindrome=expandedOdd;
			}
			
			String expandedEven = expandAroundcentre(string,i,i+1);
			if (expandedEven.length() > longestPalindrome.length()) {
				longestPalindrome=expandedEven;
			}
			
		
		}
		
		//To fix the scenario when no palindrome is found
		//as per the implementation it returns string with first char
		//So need to do this check
		if(longestPalindrome.length()!=1) {
			return longestPalindrome;
		}
		else{
			return "";
		}
	}

	private String expandAroundcentre(String string, int c1, int c2) {
		int l=c1,r=c2;
		int length=string.length();
		while(l>=0 && r<length && string.charAt(l)==string.charAt(r)) {
			l--;
			r++;
		}
		return string.substring(l+1, r);
	}
}
