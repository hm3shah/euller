package heap;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Created by hshah on 10/3/16.
 */
public class KthSmallestUsingPriorityQueue {

    public static void main(String[] args) {
        Queue<Integer> maxHeap = new PriorityQueue<>(3, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2-o1;
            }
        });

        int[] a = {1,2,3,4,5,6,7,8,9,0};

        for(int i =0; i <a.length ; i++) {
            if(i < 3) {
                maxHeap.add(a[i]);
            } else {
                int temp =  maxHeap.poll();
                if(a[i] < temp) {
                    maxHeap.add(a[i]);
                } else {
                    maxHeap.add(temp);
                }
            }
        }

        System.out.println(maxHeap);




    }

}
