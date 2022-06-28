class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k %= n;

        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            res[i] = nums[(n - k + i) % n];
        }

        for (int i = 0; i < n; i++) {
            nums[i] = res[i];
        }
    }
}