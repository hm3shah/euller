package euler;

/*The sum of the squares of the first ten natural numbers is,

12 + 22 + ... + 102 = 385
The square of the sum of the first ten natural numbers is,

(1 + 2 + ... + 10)2 = 552 = 3025
Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.*/


public class Problem6 {

	public int sumOfSquares(int number) {
		int result = number*(number+1)*(2*number+1)/6;
		return result;
	}
	
	public int squareofSum(int number) {
		int result = number*(number+1)/2;
		return result*result;
	}
	
	public static void main(String[] args) {
		Problem6 temp = new Problem6();
		System.out.println(temp.squareofSum(100)-temp.sumOfSquares(100)); //25164150

		
	}
}
