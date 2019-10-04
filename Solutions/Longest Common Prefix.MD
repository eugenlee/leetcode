### First Solution

```java
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String save = "";
        
        if (strs.length == 0) {
            return save;
        }
        
        String first = strs[0];
        int l = first.length();
        int s = strs.length;
        
        if (strs.length == 1) {
            return strs[0];
        }
        
        for (int i = 0; i < l; i++) {
            for (int c = 1; c < s; c++) {
                if ((i < strs[c].length()) && (first.charAt(i) == strs[c].charAt(i))) {
                    if (c == s-1) {
                        save += first.charAt(i);
                    }
                }
                else {
                    return save;
                }
            }
        }
        return save;
    }
}
```

### Second Solution
