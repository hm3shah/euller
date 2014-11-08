import junit.framework.TestCase;


public class FibonacciTest extends TestCase {

	public void testFib() {
		assertEquals(0,   Fibonacci.fib(0));
		assertEquals(1,   Fibonacci.fib(1));
		assertEquals(1,   Fibonacci.fib(2));
		assertEquals(2,   Fibonacci.fib(3));
		assertEquals(21,  Fibonacci.fib(8));
		assertEquals(144, Fibonacci.fib(12));
	}
}
