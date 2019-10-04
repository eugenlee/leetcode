## First Solution

```java
class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        if (k > l) k = k % l;
        int[] copy = new int[l];
        System.arraycopy(nums, 0, copy, k, l-k); 
        int z = l-k;
        for (int i = 0; i < k; i++) {
            copy[i] = nums[z];
            z++;
        }
        System.arraycopy(copy, 0, nums, 0, l);
    }
}
```

## Second Solution

```java
class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        k = k % l;
        int[] copy = new int[l];
        System.arraycopy(nums, 0, copy, k, l-k); 
        int z = l-k;
        for (int i = 0; i < k; i++) {
            copy[i] = nums[z];
            z++;
        }
        System.arraycopy(copy, 0, nums, 0, l);
    }
}
```