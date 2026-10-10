class Solution {
    public int search(int[] nums, int target) {
        int l = 0;
        int r = nums.length - 1;
        while (l <= r) {
            // [3,4,5,6,0,1,2]
            int mid = l + (r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            // left portion of array
            if (nums[mid] >= nums[l]) {
                if (nums[mid] < target || nums[l] > target) {
                    l = mid + 1;
                } else {
                    r = mid - 1;
                }
            // right portion of array
            } else {
                if (nums[mid] > target || nums[r] < target) {
                    r = mid - 1;
                } else {
                    l = mid + 1;
                }
            }
        }
        return -1;
    }
}
