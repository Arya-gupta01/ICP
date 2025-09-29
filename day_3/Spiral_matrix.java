package day_3;

public class Spiral_matrix {
    public static void main(String[] args) {
        int[][] matrix={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };
        int[] ans=spiralOrder(matrix);
        for(int num:ans){
            System.out.print(num+" ");
        }
    }
    public static int[] spiralOrder(int[][] matrix){
        if(matrix.length==0){
            return new int[]{};
        }
        int rows=matrix.length;
        int cols=matrix[0].length;
        int[] result=new int[rows*cols];
        int index=0;
        int top=0;
        int bottom=rows-1;
        int left=0;
        int right=cols-1;

        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                result[index++]=matrix[top][i];
            }
            top++;
            for(int i=top;i<=bottom;i++){
                result[index++]=matrix[i][right];
            }
            right--;
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    result[index++]=matrix[bottom][i];
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    result[index++]=matrix[i][left];
                }
                left++;
            }
        }
        return result;
    }
    
}
