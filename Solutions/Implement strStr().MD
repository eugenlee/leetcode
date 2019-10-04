### First Solution

```java
class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
        int h = haystack.length();
        
        for (int i = 0; i < h && (i + n - 1) < h && n > 0; i++) {
            
            System.out.println((haystack.substring(i, (i + n )) == needle));
            
            if ( haystack.substring(i, (i + n )) == needle ) {
                System.out.println(haystack.substring(i, (i + n )));
                return i;
            }
        } 
        
        return 0;
    }
}
```

### Second Solution

```java
class Solution {
    public int strStr(String haystack, String needle) {
        
        if (haystack == null) return 0;
        
        else if (haystack.contains(needle) == true) return haystack.indexOf(needle);
        
        else return -1;
        
    }
}
```