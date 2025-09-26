package day_1;
import java.util.*;

public class First_and_Last_position_of_element_in_array {
    public static int first(int[] arr,int target){
        int left=0;
        int right=arr.length-1;
        int first=-1;

        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                first=mid;
                right=mid-1;
            }
            else if(arr[mid]<target){
                left=mid+1;

            }
            else{
                right=mid-1;
            }

        }
        return first;
    }
    public static int last(int[]arr,int target){
        int left=0;
        int right=arr.length-1;
        int last=-1;

        while(left<=right){
            int mid=left+(right-left)/2;

            if(arr[mid]==target){
                last=mid;
                left=mid+1;

            }
            else if(arr[mid]>target){
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return last;
    }
    public static void main(String[] args){
        int arr[]={3,4,6,7,8,0,7,4};

        Arrays.sort(arr);
        
        int arr1[]=new int[2];
        arr1[0]=first(arr,4);
        arr1[1]=last(arr,4);
        System.out.println(Arrays.toString(arr1));
    }
    
}
