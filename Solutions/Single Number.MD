## First Solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int c = 0; c < nums.length; c++) {
                if (i == c && c == nums.length-1) return nums[i];
                else if (i == c) continue;
                else if (nums[i] == nums[c]) break;
                else if (c == nums.length-1) return nums[i];
            }
        }
        return -1;
    }
}
```

## Second Solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        Map<Integer, Integer> t = new HashMap<Integer, Integer>();         
        for (int i = 0; i < nums.length; i++) {
            if (!t.containsKey(nums[i])) t.put(nums[i], 1);
            else t.remove(nums[i]);
        }
        for (Integer i:t.keySet()) return i;
        return -1;
    }
}
```

## Third Solution

```java
class Solution {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int num:nums) xor^= num;
        return xor;
    }
}
```