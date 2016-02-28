package miscellaneous;

import static org.junit.Assert.assertEquals;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeMap;

import org.junit.Test;

public class NextHigherNumber {
	
	@Test
	public void testNextHigherNumber() {
		assertEquals(nextHigherNumber(15432),21345);
		
	}

	private int nextHigherNumber(int i) {
		String num = String.valueOf(i);
		Map<Integer,Integer> tree = new TreeMap<>();
		return 0;
	}
	
	public static void temp() {
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		List<Integer> list = new LinkedList<>();
		stack.push(1);
		stack.push(4);
		System.out.println(stack.toString());
		int[] a = {1,2};
		System.out.println(a.length);
		System.out.println(queue.size());
		System.out.println(stack.size());
		System.out.println(list.size());
		String harsh="harsh";
		System.out.println(harsh.substring(1));
	}

	public static void main(String[] args) {
		temp();
	}
}
