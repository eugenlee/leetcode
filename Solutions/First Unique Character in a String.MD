## First Solution

```java
class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        if (l == 1) return 0;
        for (int i = 0; i < l; i++) {
            Character s1 = s.charAt(i);
            for (int j = 0; j < l; j++) {
                if (s1.equals(s.charAt(j)) && i!=j) break;
                else if (j == l-1) return i;
            }
        }
        return -1;
    }
}
```

## Second Solution

```java
class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        Map<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < l; i++) {
            char t = s.charAt(i);
            if (h.containsKey(t)) h.put(t,2);
            else h.put(t,1);
        }
        for (int i = 0; i < l; i++) {
            if (h.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
```

## Third Solution

```java
class Solution {
    public int firstUniqChar(String s) {
        int l = s.length();
        Map<Character, Integer> h = new HashMap<>();
        for (int i = 0; i < l; i++) {
            char t = s.charAt(i);
            h.put(t,h.getOrDefault(t,0) + 1);
        }
        for (int i = 0; i < l; i++) {
            if (h.get(s.charAt(i)) == 1) return i;
        }
        return -1;
    }
}
```