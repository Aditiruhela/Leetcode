class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for (int x : nums) {
            int freq = map.getOrDefault(x, 0);
            count += freq;        // make pairs with previous same numbers
            map.put(x, freq + 1); // update frequency
        }

        return count;
    }
}
