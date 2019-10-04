### First Solution

```java
class Solution {
    public int maxSubArray(int[] nums) {
        
        int max = nums[0];
        int l = nums.length;
        int sum = 0;
        for (int s = 0; s < l; s++) {
            if (nums[s] > max) {
                max = nums[s];
            }
        }
        
        for (int i = 0; i < l; i++) {
            sum = nums[i];
            
            for (int j = i+1; j < l; j++) {
                sum += nums[j];

                if (sum > max) {
                    max = sum;

                }
                
            }
        }
        return max;
    }
}
```

### Second Solution

```java
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
```