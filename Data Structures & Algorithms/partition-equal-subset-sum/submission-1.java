class Solution {
    public boolean canPartition(int[] nums) {
        if (Arrays.stream(nums).sum() % 2 != 0) {
            return false;
        }
        int target = Arrays.stream(nums).sum() / 2;
        Set<Integer> dp = new HashSet<>();
        dp.add(0);

        for (int i = nums.length-1; i >= 0; i--) {
            Set<Integer> nextDp = new HashSet<>();
            for (int num : dp) {
                nextDp.add(num + nums[i]);
                nextDp.add(num);
            }
            dp = nextDp;
        }
        return dp.contains(target);
    }
}
