class Solution {
    public int rob(int[] nums) {
        int rob1 = 0, rob2 = 0;

        for (int num : nums) {
            int temp = Math.max(rob1 + num, rob2);
            rob1 = rob2;
            rob2 = temp;
        }
        return rob2;
    }
    // r1 = 7
    // r2 = 15
    // [5,1,2,10,6,2,7,9,3,1]
}
