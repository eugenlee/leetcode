## First Solution

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> h = new HashMap<>();
        int l = nums.length;
        for (int i = 0; i < l; i++) {
            if (!h.containsKey(nums[i])) h.put(nums[i], i);
            else return true;
        }
        return false;
    }
}
```

## Second Solution

```java
class Solution {
    public boolean containsDuplicate(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        for (int i = 0; i < l-1 && l > 1; i++) {
            if (nums[i] == nums[i+1]) return true;
        }
        return false;
    }
}
```