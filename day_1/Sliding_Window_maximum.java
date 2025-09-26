package day_1;

import java.util.*;

public class Sliding_Window_maximum {

    public static void main(String[] args) {
        int nums[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        ArrayList<Integer> ans=maxSlidingWindow(nums,k);
        System.out.println(ans);
    }   
    public static ArrayList<Integer> maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=0;i<k;i++){
            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        for(int i=k;i<nums.length;i++){
            list.add(nums[dq.peekFirst()]);

            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();
            }

            while(!dq.isEmpty() && nums[dq.peekLast()]<=nums[i]){
                dq.pollLast();
            }
            dq.offerLast(i);
        }
        list.add(nums[dq.peekFirst()]);

        
        return list;
        
    }
}
    
