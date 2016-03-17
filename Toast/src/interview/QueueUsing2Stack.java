package interview;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

public class QueueUsing2Stack<T>{

	private Stack<T> s1;
	private Stack<T> s2;
	
	public QueueUsing2Stack() {
		s1 = new Stack<T>();
		s2 = new Stack<T>();
	}
	
	public void enqueue(T value) {
		s1.push(value);
	}
	
	public T dequeue() {
		T value;
		if(s2.isEmpty()) {
			if(!s1.isEmpty()) {
			while(!s1.isEmpty()) {
				s2.push(s1.pop());
			}
			} else {
				return null;
			}
		}
		value = s2.pop();
		return value;
	}

	@Test
	public void test() {
		QueueUsing2Stack<Integer> queue = new QueueUsing2Stack<Integer>();
		queue.enqueue(1);
		assertTrue((queue.dequeue().equals(1)));
		queue.enqueue(2);
		assertTrue((queue.dequeue().equals(2)));
		queue.enqueue(3);
		queue.enqueue(4);
		assertTrue((queue.dequeue().equals(3)));
		assertTrue((queue.dequeue().equals(4)));
		assertEquals(queue.dequeue(),null);
	}
}

