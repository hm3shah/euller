import java.util.ArrayList;
import java.util.List;


public class Temp {

	public static void main(String[] args) {	
		
		//int temp[] = new int[4];
		
		//Integer[] temp = new Integer[4];
		/*temp[0] = 1;
		temp[1] = 1;
		temp[2] = 1;
		temp[3] = 1;
		*/
			
		List<Integer> temp = new ArrayList<Integer>(4);
		temp.add(4);
		for(int i: temp)
			System.out.println(i);
	}
}
	