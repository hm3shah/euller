package miscellaneous;

public class PrintFromOnetoHundred {
	
	public static void main(String[] args) {
		for(int i =1; i <= 100; ++i) {
			if(i%3==0 && i%5==0)
				System.out.println("Kevin Bacon");
			else if(i%3==0)
				System.out.println("Kevin");
			else if(i%5==0)
				System.out.println("Bacon");
			else	
				System.out.println(i);
		}
	}

}
