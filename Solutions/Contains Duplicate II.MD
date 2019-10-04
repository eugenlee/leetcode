## First Solution

```java
class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int l = nums.length;
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < l; i++) {
            if (h.containsKey(nums[i])) {
                if (i - h.get(nums[i]) <= k) return true;
                else h.put(nums[i], i);
            }
            else h.put(nums[i], i);
        }
        return false;
    }
}
```