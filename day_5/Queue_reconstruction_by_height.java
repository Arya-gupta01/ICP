package day_5;

public class Queue_reconstruction_by_height {
    public static void main(String[] args) {
        int[][] people = { {7,0}, {4,4}, {7,1}, {5,0}, {6,1}, {5,2} };
        int[][] ans=reconstructQueue(people);
        for(int[] person:ans){
            System.out.print("["+person[0]+","+person[1]+"] ");
        }
    }
    public static int[][] reconstructQueue(int[][] people){
        java.util.Arrays.sort(people,(a,b)->{
            if(a[0]==b[0]){
                return Integer.compare(a[1],b[1]);
            }else{
                return Integer.compare(b[0],a[0]);
            }
        });
        java.util.List<int[]> result=new java.util.ArrayList<>();
        for(int[] person:people){
            result.add(person[1],person);
        }
        return result.toArray(new int[people.length][]);
    }
    
}
