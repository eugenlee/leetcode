class Solution {
    public int maxSubArray(int[] nums) {
        
        int l = nums.length;
        if (l == 0) return 0;
        if (l == 1) return nums[0];
        int max = nums[0];
        int sum = nums[0];
        
        for (int i = 1; i < l; i++) {
            
            int n = sum + nums[i];
            
            if (nums[i] > n && nums[i] > sum) sum = nums[i];
            else sum += nums[i];
            
            if (sum > max) max = sum;
            
        }
        return max;
    }
}