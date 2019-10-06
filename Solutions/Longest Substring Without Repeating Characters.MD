## First Solution

```java
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count = 0, max = 0, l = s.length();
        Map<Character, Integer> a = new HashMap<>();
        
        for (int i = 0; i < l; i++) {
            Character cha = s.charAt(i);
            if (!a.containsKey(cha)) {
                a.put(cha, i);
                count++;
            }
            else {
                i = a.get(cha);
                a.clear();
                count = 0;
            }
            if (count > max) max = count;
        }
        return max;
    }
}
```

## Second Solution (LeetCode solution)

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int i = 0, j = 0, max = 0, l = s.length();
        Set<Character> a = new HashSet<>();
        
        while (i < l && j < l) {
            if (!a.contains(s.charAt(i))) {
                a.add(s.charAt(i++));
                max = Math.max(max, i-j);
            }
            else a.remove(s.charAt(j++));
        }
        return max;
    }
}
```

## Third Solution (LeetCode solution)

```java
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, l = s.length();
        Map<Character, Integer> h = new HashMap<>();
        
        for (int i = 0, j = 0; i < l; i++) {
            if (h.containsKey(s.charAt(i))) j = Math.max(h.get(s.charAt(i)),j);
            
            max = Math.max(max, i-j+1);
            h.put(s.charAt(i), i+1);
        }
        return max;
    }
}
```