package day_7;
import java.util.*;


public class Maximum_subarray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(maxSum(arr));
        
    }
    public static int maxSum(int[] arr){
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(sum>=0){
            sum+=arr[i];
        }
            else{
                sum=arr[i];
            }
           
            max=Math.max(max,sum);
        }
        return max;
    }
    
}
