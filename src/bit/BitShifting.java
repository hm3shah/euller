package bit;

public class BitShifting {

	public static void main(String[] args) {
		int i =1;
		System.out.println("Shifted ledt by 5 places: " +(i<<30));
		MyStack<Integer> mystack = (new BitShifting()).new MyStack<>();
		mystack.t=5;
		System.out.println(mystack.toString());
		
		int neg = ~1;
		System.out.println(neg);
		System.out.println(Integer.toBinaryString(neg));
		neg +=1;
		System.out.println(Integer.toBinaryString(neg));
		neg = ~0;
		System.out.println(neg);
		System.out.println(Integer.toBinaryString(neg));
		neg +=1;
		System.out.println(Integer.toBinaryString(neg));
		neg = -1;
		System.out.println(neg);
		System.out.println(Integer.toBinaryString(neg));

	}
	
	public class MyStack<Y> {
		public Y t;
		
	}
}

class MyStack<Y> {
	public Y t;
	
}
