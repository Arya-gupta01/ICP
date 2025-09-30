package day_2;

import java.util.PriorityQueue;

    public class Kth_largest_element_in_array {
    public static void main(String[] args) {
        int[] nums={3,2,1,5,6,4};
        int k=3;
        int ans=kLargest(nums,k);
        System.out.println(ans);
       
    }
    public static int kLargest(int[] nums,int k){
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();

        for(int num:nums){
            minHeap.add(num);
      
            }
            while(minHeap.size()>k){
                minHeap.poll();
            }
            return minHeap.peek();
        }
        
    }
