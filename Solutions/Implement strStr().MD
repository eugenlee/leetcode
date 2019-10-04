### First Solution

```java
class Solution {
    public int strStr(String haystack, String needle) {
        
        int n = needle.length();
        int h = haystack.length();
        
        if (needle == null || needle.isEmpty()) return 0;
        
        for (int i = 0; i < h && (i + n - 1) < h && n > 0; i++) {
            if ( haystack.substring(i, (i + n )).equals(needle) ) {
                return i;
            }
        } 
        
        return -1;
        
        /* if (haystack == null) return 0;
        
        else if (haystack.contains(needle) == true) return haystack.indexOf(needle);
        
        else return -1; */
        
    }
}
```

### Second Solution
