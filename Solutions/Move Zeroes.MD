## First Solution

```java
class Solution {
    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (nums[i] == 0) zeroes++;
            else if (zeroes > 0) {
                nums[i-zeroes] = nums[i];
                nums[i] = 0;
            }
        } 
    }
}
```