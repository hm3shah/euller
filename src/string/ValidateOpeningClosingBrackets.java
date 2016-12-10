package string;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import org.junit.Test;

public class ValidateOpeningClosingBrackets {

	@Test
	public void testBracketsAreBalanced() {
		assertTrue(true);
		assertTrue(bracketsAreBalanced("()"));
		assertTrue(bracketsAreBalanced("((()))"));
		assertFalse(bracketsAreBalanced("(()))"));
		assertTrue(bracketsAreBalanced("()()"));
		assertFalse(bracketsAreBalanced("(()"));
		assertTrue(bracketsAreBalanced("(){}"));
		assertFalse(bracketsAreBalanced("({)}"));
		assertFalse(bracketsAreBalanced("({[])}"));
		assertTrue(bracketsAreBalanced("(){}[]"));
		assertTrue(bracketsAreBalanced("[({})]"));
	}
	
	public boolean bracketsAreBalanced(String string) {
		Stack<Character> openBracketStack = new Stack<>();
		int length = string.length();
		boolean isBalanced = false;
		
		for(int i=0; i < length; ++i) {
			char ch = string.charAt(i);
			switch (ch){
				case '(': 
				case '{':
				case '[':
				{
					openBracketStack.push(ch);
					break;
				}
				case ')': {
					if(!openBracketStack.empty() && openBracketStack.peek()=='(') {
						openBracketStack.pop();
						isBalanced = true;
					} else {
						isBalanced = false;
					}
					break;
				}
				case '}':
				{
					if(!openBracketStack.empty() && openBracketStack.peek()=='{') {
						openBracketStack.pop();
						isBalanced = true;
					} else {
						isBalanced = false;
					}
					break;
				}
				case ']':
				{
					if(!openBracketStack.empty() && openBracketStack.peek()=='[') {
						openBracketStack.pop();
						isBalanced = true;
					} else {
						isBalanced = false;
					}
					break;
				}
			}
		}
		if(!openBracketStack.empty()) {
			isBalanced=false;
		}
		return isBalanced;
	}
	
}
