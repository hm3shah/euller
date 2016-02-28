package miscellaneous;

public class NumberofPrimeNumbers {

	static int getNumberOfPrimes(int N) {
        int count=1;
        for(int i=2; i < N; ++i) {
            for(int j = 2; j <i; ++j) {
                if(i%j!=0 && i==j+1) {
                    count++;
                } else if (i%j==0) {
                	break;
                }
            }
        }
        return count;
    }
	
	
	static int isPalindrome(String a) {
		System.out.println(a);
        String temp = a.replaceAll("[^a-zA-Z0]","").toLowerCase();
        System.out.println("Temp: " + temp);
        String temp1 = a.toLowerCase().replaceAll("[^a-z]", "");
        System.out.println("Temp1: " + temp1);
        int length = temp.length();
        
        for(int i=0, j=length-1;i<length/2;++i,j--) {
            if(temp.charAt(i)!=temp.charAt(j)) {
                return 0;
            }
        }
        return 1;
    }
	
	
	static int angleBetweenHands(String time) {
        int hour = Integer.valueOf(time.substring(0, 2));
        int min = Integer.valueOf(time.substring(3));
        System.out.println("h:  " + hour+ "  min: " + min);
        if(hour > 12) {
        	hour = hour-12;
        }
        System.out.println("h:  " + hour+ "  min: " + min);
        
       float hourAngle = ((hour + (float)min/60)/12)*360;
       System.out.println(hourAngle);
       
       float minAngle = ((float)min/60)*360;
       System.out.println(minAngle);
       
       int difference = (int)(Math.abs(Math.round (hourAngle-minAngle)));
       System.out.println(difference);
       if(difference > 180) {
    	   difference = 360 - difference;
       }
       return difference;

    }
	
	public static void main(String[] args) {
	//	System.out.println(getNumberOfPrimes(100));
		System.out.println(isPalindrome("A Toyota."));
		System.out.println(isPalindrome("A Toyota.-_0"));
		//angleBetweenHands("23:00");
	}
	
}
