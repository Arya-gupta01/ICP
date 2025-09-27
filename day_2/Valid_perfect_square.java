package day_2;

public class Valid_perfect_square {
    public static void main(String[] args) {
        int num=16;
        boolean ans=isPerfectSquare(num);
        System.out.println(ans);
    }
    public static boolean isPerfectSquare(int num){
        if(num<2){
            return true;
        }
        long left=2;
        long right=num/2;

        while(left<=right){
            long mid=left+(right-left)/2;
            long guessedSquare=mid*mid;

            if(guessedSquare==num){
                return true;
            }
            if(guessedSquare>num){
                right=mid-1;
            }else{
                left=mid+1;
            }
        }
        return false;
    }
    
}
