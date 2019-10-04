## First Solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            Integer c = h.get(nums[i]);
            if (c == null) {
                h.put(nums[i], 1);
            }
            else {
                h.put(nums[i], c+1);
            }
        }
        for (Integer z:h.keySet()) {
            if (h.get(z) > l/2) return z;
        }
        return -1;
    }
}
```

## Second Solution

```java
class Solution {
    public int majorityElement(int[] nums) {
        int c = 0, mj = 0;
        
        for (int num:nums) {
            if (c == 0) {
                mj = num;
            } 
            
            c += (num == mj) ? 1 : -1;
        }
        return mj;
    }
}
```