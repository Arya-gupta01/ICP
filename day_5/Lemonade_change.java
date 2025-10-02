package day_5;

public class Lemonade_change {
    public static void main(String[] args) {
        
        int[] bills = {5, 5, 10, 10, 20};
        boolean ans=lemonadeChange(bills);
        System.out.println(ans);
    }

    public static boolean lemonadeChange(int[] bills) {
        int five = 0, ten = 0;
        for (int bill : bills) {
            if (bill == 5) {
                five++;
            } else if (bill == 10) {
                if (five == 0) return false;
                five--;
                ten++;
            } else {
                if (ten > 0 && five > 0) {
                    ten--;
                    five--;
                } else if (five >= 3) {
                    five -= 3;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
    
}
