class Solution {
    // Recursive solution
    public int search(int[] nums, int target) {
        return helper(nums, target, 0, nums.length - 1);
    }

    private int helper(int[] nums, int target, int l, int r) {
        if (l > r) {
            return -1;
        }

        int mid = l + ((r - l) / 2);

        if (nums[mid] < target) {
            return helper(nums, target, mid + 1, r);
        } else if (nums[mid] > target) {
            return helper(nums, target, l, mid - 1);
        } else {
            return mid;
        }
    }
}