package interview;

public class Eventbrite_RotateArrayBy90 {

	  public static void main(String[] args) {
		  Eventbrite_RotateArrayBy90 solution = new Eventbrite_RotateArrayBy90();
	    int[][] array1 = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    
	    System.out.println("Printing given array: ");
	    
	    for(int i=0; i< array1.length; ++i) {
	    	for(int j=0; j < array1[i].length; ++j) {
	    		System.out.print(array1[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    int[][] rotated1 =solution.rotateClockWise(array1);
	    System.out.println();
	    System.out.println("Printing rotated array");
	    for(int i=0;i<rotated1.length;++i) {
	      for(int j=0;j<rotated1[i].length;++j) {
	        System.out.print(rotated1[i][j] + " ");
	      }
	      System.out.println();
	    }
	    System.out.println("*******************");
	    int[][] array2 = {{5,6,7,8},{9,10,11,12},{13,14,15,16}};
	    /*
	     * 
	     * 5, 6, 7, 8
	     * 9, 10, 11, 12
	     * 13, 14, 15, 16
	     */
	    int[][] rotated2 =solution.rotateClockWise(array2);
	    for(int i=0;i<rotated2.length;++i) {
	      for(int j=0;j<rotated2[i].length;++j) {
	        System.out.print(rotated2[i][j] + " ");
	      }
	      System.out.println();
	    }

	  }
	  
	  public int[][] rotateClockWise(int[][] array) {
	    int[][] rotated = new int[array[0].length][array.length];
	    
	    int rowLen = array.length;
	    int colLen = array[0].length;
	    
	    for(int i=0;i< rowLen; ++i) {
	      for(int j=0;j<colLen;++j) {
	        int m = array[i][j];
	        //00 -> (j)(colLen-i-1)     03
	        //01 -> (j)(colLen-i-1)     13
	        //02 -> (j)(colLen-i-1)     23
	        
	        
	        //10 -> (j)(colLen-i-1)     02
	        //11 -> (j)(colLen-i-1)     12
	        //12 -> (j)(colLen-i-1)     22
	        rotated[j][rowLen-i-1]=m;    
	      }
	     // System.out.println();
	    }
	  return rotated;      
	  }
	  
	}


	/* 
	Your previous Python content is preserved below:

	"""
	Write a function that takes that square multiplication matrix, and returns the matrix in the same structure, rotated 90 degrees clockwise:

	So if you started with:
	[
	   [1,  2,  3,  4],
	   [5,  6,  7,  8],
	   [9,  10, 11, 12],
	   [13, 14, 15, 16],
	]


	It would become:
	[
	   [13,  9, 5, 1],
	   [14, 10, 6, 2],
	   [15, 11, 7, 3],
	   [16, 12, 8, 4],
	]
	"""

	def rotate_matrix(matrix):
	    #your code here
	    
	    return matrix
	    

	matrix = [
	   [1,  2,  3,  4],
	   [5,  6,  7,  8],
	   [9,  10, 11, 12],
	   [13, 14, 15, 16],
	]

	rotated_matrix = rotate_matrix(matrix)

	print rotated_matrix

	assert(len(rotated_matrix) == len(matrix))
	#your additional test cases here

	 */
	
	
	

