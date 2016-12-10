import java.util.HashMap;


public class HashCodeEquals {

	
	public static class Apple {
		private String color;
	 
		public Apple(String color) {
			this.color = color;
		}
	 
//		@Override
//		public boolean equals(Object obj) {
//			if (!(obj instanceof Apple))
//				return false;	
//			if (obj == this)
//				return true;
//			return this.color.equals(((Apple) obj).color);
//		}
		
		@Override
		public int hashCode() {
			return this.color.length();
		}
	 
		public static void main(String[] args) {
			Apple a1 = new Apple("green");
			Apple a2 = new Apple("red");
	 
			//hashMap stores apple type and its quantity
			HashMap<Apple, Integer> m = new HashMap<Apple, Integer>();
			m.put(a1, 10);
			m.put(a2, 20);
			System.out.println(m.get(new Apple("green")));
			System.out.println(m.get(a1));
			
			System.out.println(Integer.MAX_VALUE);
			System.out.println(Character.BYTES);
			
			System.out.println(32000 >> 5) ;
		}
	}
}
