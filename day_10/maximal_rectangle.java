package day_10;

public class maximal_rectangle {
 
    public int maximalRectangle(char[][] arr) {
        int ans=0;
        int n=arr.length;
        int m=arr[0].length;

        for(int i=0;i<n;i++){
            int r[]=new int[m];
            for(int j=i;j<n;j++){
                for(int k=0;k<m;k++){
                    r[k]+=arr[j][k]-'0';
                }
                int h=j-i+1;
                int sum=0;
                for(int k=0;k<m ;k++){
                    if(r[k]==h){
                        sum+=h;
                        ans=Math.max(ans,sum);

                    }
                    else sum=0;

                }


            }
        }
        return ans;
        
    }
}
    

