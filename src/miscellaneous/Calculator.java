package miscellaneous;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class Calculator {
	
	@Test
	public void testEvaluate() {
		assertTrue(true);
		assertEquals(evaluate("3+9"),12);
		assertEquals(evaluate("3"),3);
		assertEquals(evaluate("((3+9))"),12);
		assertEquals(evaluate("(3+9)+5+9"),26);
		assertEquals(evaluate("(2+(6+1+3)-5)"),7);
		assertEquals(evaluate("(2+(6+1+3)-5)-(2+(6+1+3)-5)"),0);
	}
	
	public int evaluate(String expression) {
		int result=0;
		Stack<Integer> number = new Stack<>();
		Stack<Character> sign = new Stack<>();
        int length = expression.length();

        for(int i=0; i<length; ++i) {
            if(expression.charAt(i)=='(') {
            	int count=1;
            	int j=i+1;
            	while(count!=0) {
            		if(expression.charAt(j)=='(') {
            			count++;
            		} else if(expression.charAt(j)==')') {
            			count--;
            		}
            		++j;
            	}
            	number.push(evaluate(expression.substring(i+1,j)));
            	i=j-1;
            } else if(expression.charAt(i)==')') {
            	
            } else if(expression.charAt(i)=='+') {
            	sign.push('+');
            } else if(expression.charAt(i)=='-') {
            	sign.push('-');
            } else {
            	Integer temp = Character.getNumericValue(expression.charAt(i));
            	number.push(temp);
            }
        }
        result = number.pop();
        while(!number.empty()) {
        	Integer num2 = number.pop();
        	Character sign1 = sign.pop();
        	if(sign1=='+') 
        		result +=num2;
        	else if (sign1=='-')
        		result = num2-result;
        }
        return result;
    }
}
