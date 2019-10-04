## First Solution

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        List<Integer> ok = new ArrayList<>();
        Set<Integer> s = new HashSet<>();
        for (Integer num : nums) s.add(num);
        
        for (int i = 1; i <= l; i++) {
            if (s.contains(i) == false) ok.add(i);
        }
        
        return ok;
    }
}
```

## Second Solution

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int l = nums.length;
        List<Integer> ok = new ArrayList<>();
        
        for (int i = 0; i < l; i++) {
            int n = Math.abs(nums[i]) - 1;
            if (nums[n] > 0) nums[n] = -nums[n];
        }
        
        for (int i = 0; i < l; i++) {
            if (nums[i] > 0) ok.add(i+1);
        }
        
        return ok;
    }
}
```

## Third Solution

```java
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int ans [] = new int[nums.length+1];
        List<Integer> ans2 = new ArrayList<Integer>();
        for(int i = 0;i<nums.length;i++) {
            ans[nums[i]]++;
        }
        for (int i=1;i<ans.length;i++)
            if(ans[i]==0)
                ans2.add(i);
        return ans2;
    }
}
```