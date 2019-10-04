## First Solution

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) return false;
        Map<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < l1; i++) {
            if (h.containsKey(s.charAt(i))) { 
                h.put(s.charAt(i),h.getOrDefault(s.charAt(i),0) + 1);
            }
            else h.put(s.charAt(i), 1);
        }
        
        for (int j = 0; j < l2; j++) {
            if (h.containsKey(t.charAt(j)) && h.get(t.charAt(j)) != 0) {
                h.put(t.charAt(j),h.getOrDefault(t.charAt(j),0) - 1);
            }
            else return false;
        }
        
        return true;
    }
}
```

## Second Solution

```java
class Solution {
    public boolean isAnagram(String s, String t) {
        int l1 = s.length();
        int l2 = t.length();
        if (l1 != l2) return false;
        if (l1 == 0 && l2 ==0) return true;
        int s1 = 0;
        int t1 = 0;
        for (int i = 0; i < l1; i++) {
            s1 += (int) s.charAt(i);
            t1 += (int) t.charAt(i);
            if (s.indexOf(t.charAt(i)) == -1) return false;
            }
        return t1 == s1;
    }
}
```