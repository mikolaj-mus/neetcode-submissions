class Solution {
    List<List<Integer>> res;
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        res = new ArrayList<>();
        List<Integer> cur = new ArrayList<>();
        backtrack(0, cur, nums, target);
        return res;
    }
    public void backtrack(int i, List<Integer> cur, int[] nums, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(cur));
            return;
        }
        if (i >= nums.length || target < 0) {
            return;
        }
        cur.add(nums[i]);
        backtrack(i, cur, nums, target - nums[i]);
        cur.remove(cur.size() - 1);
        backtrack(i+1, cur, nums, target);
    }
}
