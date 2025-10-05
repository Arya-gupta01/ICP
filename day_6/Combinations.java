package day_6;
import java.util.*;


public class Combinations {
    class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> res=new ArrayList<>();
        
    combination(n,k,res,1,new ArrayList<>());
    return res;
    }
    public static void combination(int n ,int k, List<List<Integer>>res,int num ,List<Integer> curr){
        //base case
        if(curr.size()==k){
            res.add(new ArrayList<>(curr));
            return;
        }
        for(int i=num;i<=n;i++){
            curr.add(i);
            combination(n,k, res,i+1,curr);
            curr.remove(curr.size()-1);
        }
    }
}
    
    
}
