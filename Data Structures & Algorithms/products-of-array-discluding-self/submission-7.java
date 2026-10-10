class Solution {
    public int[] productExceptSelf(int[] nums) {
        // int[] prefix = new int[nums.length];
        // prefix[0] = nums[0];
        // for (int i = 1; i < prefix.length; i++) {
        //     prefix[i] = nums[i] * prefix[i-1];
        // }
        // int[] postfix = new int[nums.length];
        // postfix[nums.length-1] = nums[nums.length-1];
        // for (int i = nums.length-2; i >= 0; i--) {
        //     postfix[i] = nums[i] * postfix[i+1];
        // }
        // int[] result = new int[nums.length];
        // result[0] = postfix[1];
        // result[nums.length-1] = prefix[nums.length-2];
        // for (int i = 1; i < nums.length-1; i++) {
        //     result[i] = prefix[i-1] * postfix[i+1];
        // }

        int[] result = new int[nums.length];
        int prefix = 1;
        for (int i = 0; i < result.length; i++) {
            result[i] = prefix;
            prefix *= nums[i];
        }
        int postfix = 1;
        for (int i = nums.length-1; i >= 0; i--) {
            result[i] = result[i] * postfix;
            postfix *= nums[i];
        }

        return result;
    }
}