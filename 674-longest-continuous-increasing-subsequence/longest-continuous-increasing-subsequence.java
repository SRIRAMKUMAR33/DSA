class Solution {
    public int findLengthOfLCIS(int[] nums) {
        if (nums == null || nums.length == 0) return 0;
        int dp = 1;
        int globalMax = 1;
        for (int i = 1; i < nums.length; i++) {
            dp = (nums[i] > nums[i - 1]) ? dp + 1 : 1;
            globalMax = Math.max(globalMax, dp);
        }
        return globalMax;
    }
}