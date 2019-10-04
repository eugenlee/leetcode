## First Solution

```java
class Solution {
    int min = Integer.MAX_VALUE;;
    int max = 0;
    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length;
        int[] n = new int[l];
        System.arraycopy(nums, 0, n, 0, l);
        Arrays.sort(nums);
        for (int i = 0; i < l; i++) {
            if (nums[i] != n[i]) {
                if (i < min) min = i;
                else if (i > max) max = i;
            }
        }
        if (min == Integer.MAX_VALUE && max == 0) return 0;
        else return max-min+1;
    }
}
```

## Second Solution

```java
class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int l = nums.length;
        if (l < 2) return 0;
        int max = nums[l-1];
        int min = nums[0];
        int le = l-1;
        int r = 0;
        for (int i = 0; i < l; i++) {
            if (nums[i] < min) r = i;
            else if (nums[i] > min) min = nums[i];
            
            if (nums[l-1-i] > max) le = l-1-i;
            else if(nums[l-1-i] < max) max = nums[l-1-i];
        }
        return r-le < 0 ? 0 : r-le+1;
    }
}
```