### First Solution

```java
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