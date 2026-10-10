class Solution {
    public int minCostClimbingStairs(int[] cost) {
        // [10,15,20,10,15]

        for (int i = cost.length - 3; i >= 0; i--) {
            cost[i] += Math.min(cost[i+1], cost[i+2]);
        }
        return Math.min(cost[0], cost[1]);
    }
}
