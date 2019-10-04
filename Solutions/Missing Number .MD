## First Solution

```java
class Solution {
    public int missingNumber(int[] nums) {
        int l = nums.length;
        int should_be = 0;
        int iterator = 1;
        int actual = 0;
        for (int i = 0; i < l; i++) {
            actual += nums[i];
            should_be += iterator;
            iterator++;
        }
        return should_be - actual;
    }
}
```