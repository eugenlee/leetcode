### First Solution

```java
class Solution {
    public int searchInsert(int[] nums, int target) {
        int l = nums.length;
        int i = 0;
        for (i = 0; i < l; i++) {
            int n = nums[i];
            if (n == target) return i;
            else if (n > target) {
                return i;
            }
        }
        return i;
    }
}
```