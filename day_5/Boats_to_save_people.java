package day_5;
import java.util.*;


public class Boats_to_save_people {
    public static void main(String[] args) {
        int[] people = {3,5,3,4};
        int limit = 5;
        int boats=numBoats(people,limit);
        System.out.println(boats);
    }
    public static int numBoats(int[] people,int limit){
        Arrays.sort(people);
        int i=0;
        int j=people.length-1;
        int boats=0;

        while(i<=j){
            if(people[i]+people[j]<=limit){
                i++;
            }
            j--;
            boats++;
        }
        return boats;
    }
    
}
