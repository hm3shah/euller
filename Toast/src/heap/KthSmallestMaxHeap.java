package heap;

/**
 * Get the kth smallest value from an unsorted array
 * @author harshshah
 *
 */
public class KthSmallestMaxHeap {
	
	int[] heapArray;
	//int capacity;
	int heapSize;
	
	public KthSmallestMaxHeap(int[] a, int size) {
		this.heapSize=size;
		this.heapArray=a;
		
		int i = (heapSize-1)/2;
		while(i>=0) {
			maxHeapify(i);
			i--;
		}
	}

	public KthSmallestMaxHeap() {
		// TODO Auto-generated constructor stub
	}

	private void maxHeapify(int i) {
		int l = left(i);
		int r = right(i);
		int largest = i;
		if((l<heapSize) && heapArray[l]>heapArray[i]) {
			largest=l;
		}
		if(r<heapSize && heapArray[r]>heapArray[largest]) {
			largest=r;
		}
		if(largest!=i) {
			swap(i,largest);
			maxHeapify(largest);
		}
		
	}

	private int kthSmallest(int[] input, int n, int k) {
		KthSmallestMaxHeap maxHeap = new KthSmallestMaxHeap(input,k);
		for(int i=k; i<n; ++i) {
			if(input[i] < maxHeap.getMax()) {
				maxHeap.replaceMax(input[i]);
				System.out.println();
			}
		}
		return maxHeap.getMax();
		
	}
	
	
	public static void main(String[] args) {
		KthSmallestMaxHeap temp = new KthSmallestMaxHeap();
		int[] input= {1,4,8,6,3,2};//1,2,3,4,6,8
		System.out.println(temp.kthSmallest(input,input.length,5));
		
	}
	
	private void replaceMax(int i) {
		heapArray[0]=i;
		maxHeapify(0);
	}

	private int getMax() {
		if(heapSize!=0) {
			return heapArray[0];
		}
		return Integer.MIN_VALUE;
	}

	private void swap(int i, int largest) {
		int temp = heapArray[i];
		heapArray[i]=heapArray[largest];
		heapArray[largest]=temp;
	}

	private int right(int i) {
		return 2*i + 2;
	}

	private int left(int i) {
		return 2*i + 1;
	}
}
