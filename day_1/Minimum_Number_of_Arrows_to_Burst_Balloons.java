package day_1;
import java.util.*;

public class Minimum_Number_of_Arrows_to_Burst_Balloons {
    public static void main(String[] args) {
        int[][] baloons = { {10,16}, {2,8}, {1,6}, {7,12} };
        int arrows=minArrows(baloons);
        System.out.println(arrows);
    }
    public static int minArrows(int[][] baloons){
        if(baloons.length==0){
            return 0;
        }
        Arrays.sort(baloons,(a,b)->Integer.compare(a[1],b[1]));
        int arrows=1;
        int pos=baloons[0][1];

        for(int[] baloon:baloons){
            if(baloon[0]>pos){
                arrows++;
                pos=baloon[1];
            }
        }
        return arrows;
    }
    
}
