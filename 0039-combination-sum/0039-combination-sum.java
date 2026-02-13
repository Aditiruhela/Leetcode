import java.util.*;

class Solution {

    public List<List<Integer>> combinationSum(int[] arr, int x) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(0, arr, x, 0, res, new ArrayList<>());
        return res;
    }

    public void backtrack(int ind, int[] arr, int x, int sum,
                          List<List<Integer>> res,
                          List<Integer> curr) {

        // Base case: if sum becomes equal to target
        if (sum == x) {
            res.add(new ArrayList<>(curr));
            return;
        }

        // If sum exceeds target OR index out of bounds
        if (sum > x || ind == arr.length) {
            return;
        }

        // -------- Take the element --------
        curr.add(arr[ind]);
        backtrack(ind, arr, x, sum + arr[ind], res, curr);  
        curr.remove(curr.size() - 1);   // backtrack

        // -------- Skip the element --------
        backtrack(ind + 1, arr, x, sum, res, curr);
    }
}
