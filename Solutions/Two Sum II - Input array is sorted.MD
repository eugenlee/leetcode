## First Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] hol = new int[2];
        int l = numbers.length;
        Map<Integer, Integer> h = new HashMap<>();
        
        for (int i = 0; i < l; i++) {
            int diff = target - numbers[i];
            if (h.containsKey(diff)) {
                hol[0] = h.get(diff)+1;
                hol[1] = i+1;
                return hol;
            }
            else h.put(numbers[i],i);
        }
        
        return hol;
    }
}
```

## Second Solution

```java
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = numbers.length;
        int i = 0; 
        int big = l-1;
        while (numbers[i] + numbers[big] != target) {
            if (numbers[i] + numbers[big] > target) big--;
            else i++;
        }
        
        return new int[] {i+1, big+1};
    }
}
```