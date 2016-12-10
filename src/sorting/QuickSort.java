package sorting;

import static org.junit.Assert.*;

import org.junit.Test;

//Radix Sort
//Counting Sort

public class QuickSort {

	@Test
	public void testQuickSort() {
		int[] temp = {1,2,3,4,5};
		//assertEquals(quickSort(new int[]{1,2,3,4,5}),temp);
	}
	
	public void quickSort(int[] input, int low, int high) {
		int mid = low + (high-low)/2;
		int pivot = input[mid];
		int i=low, j=high;
		while(i<j) {
			while(input[i] < pivot) {
				i++;
			}
			while(input[j] > pivot) {
				j--;
			}
			if(i <= j) {
				int temp = input[i];
				input[i]=input[j];
				input[j]=temp;
				i++;
				j--;
			}
		}
		if(low < j) {
			quickSort(input,low,j);
		}
		if(high > i) {
			quickSort(input,i,high);
		}
	}
	
	public static void main(String[] args) {
		QuickSort quickSort = new QuickSort();
		int[] input = {9,2,4,7,3,7,10};
		quickSort.quickSort(input, 0,6 );
		for(int i=0;i<7;++i) {
			System.out.print(input[i] + " ");
		}
	}
}
