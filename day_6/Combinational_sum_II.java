package day_6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combinational_sum_II {
    

public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates); // Sort to handle duplicates
        backtrack(candidates, 0, target, new ArrayList<>(), result);
        return result;
    }

    private void backtrack(int[] candidates, int start, int target,
                           List<Integer> path, List<List<Integer>> result) {
        if (target == 0) {
            result.add(new ArrayList<>(path)); 
            return;
        }

        for (int i = start; i < candidates.length; i++) {
            // Skip duplicates at the same recursive level
            if ((i==start || candidates[i-1] != candidates[i]) && candidates[i]<=target) {
                path.add(candidates[i]);
                backtrack(candidates,i+1,target-candidates[i],path,result);
                path.remove(path.size()-1);
            }
        }
    }
}

    


    
}
