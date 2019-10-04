### First Solution

```c
/**
 * Note: The returned array must be malloced, assume caller calls free().
 */
int* twoSum(int* nums, int numsSize, int target) {
    static int array[2];
    for (int a = 0; a < numsSize; a++){
        for (int b = a + 1; b < numsSize; b++){
            if (nums[a] + nums[b] == target){
                array[0] = a;
                array[1] = b;
                return array;
            }
        }
    }
    return -1;
}
```

### Second Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int[] z = new int[2];
        for (int i = 0; i < l; i++) {
            for (int j = i+1; j < l; j++) {
                if (nums[i]+nums[j] == target) {
                    z[0] = i;
                    z[1] = j;
                    return z;
                }
            }
        }
        return z;
    }
}
```

### Third Solution

```java
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        int[] z = new int[2];
        Map<Integer, Integer> la = new HashMap<>();
        for (int i = 0; i < l; i++) {
            int diff = target - nums[i];
            if (la.containsKey(diff)) {
                z[0] = la.get(diff);
                z[1] = i;
                return z;
            }
            else la.put(nums[i], i);
        }
        return z;
    }
}
```