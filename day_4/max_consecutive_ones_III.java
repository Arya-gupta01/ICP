package day_4;

public class max_consecutive_ones_III {
    public static void main(String[] args) {
        
    
    int[] arr={1,1,1,1,0,0,1,1,1,1,0};
    int k=2;
    int ans=maxlen(arr,k);
    System.out.println(ans);
}

    public static int  maxlen(int[]arr,int k){
        int left=0;
        int right=0;
        int zeros=0;
        int maxlen=0;

        while(right<arr.length){
            if(arr[right]==0){
                zeros++;
            }
            while(zeros>k){
                if(arr[left]==0){
                    zeros--;
                }
                left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
            right++;
        }
        return maxlen;
    }
    
}
