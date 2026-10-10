class Solution {
    public int longestConsecutive(int[] nums) {
        int streak = 0;
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }
        for (int num : nums) {
            if (!set.contains(num-1)) {
                int current = 1;
                while(set.contains(num+1)) {
                    current++;
                    num++;
                }
                streak = Math.max(current, streak);
            }
        }
        return streak;
    }
}
