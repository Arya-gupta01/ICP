package day_5;
import java.util.*;

public class Non_overlapping_intervals {
    public static void main(String[] args) {
        int[][] intervals = { {1,2}, {2,3}, {3,4}, {1,3} };
        int removals=removeIntervals(intervals);
        System.out.println(removals);
    }
    public static int removeIntervals(int[][] intervals){
        if(intervals.length==0){
            return 0;
        }
        Arrays.sort(intervals,(a,b)->Integer.compare(a[1],b[1]));
        int overlapping=0;
        int end=intervals[0][1];

        for(int i=1;i<intervals.length;i++){
            if(intervals[i][0]<end){
                overlapping++;
                end=intervals[i][1];
            }
        }
        return overlapping;
    }

    
}
