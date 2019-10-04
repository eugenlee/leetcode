## First Solution

```java
class Solution {
    public int titleToNumber(String s) {
        int c = 0;
        int m = 1;
        int l = s.length();
        for (int i = l-1; i > -1; i--) {
            c = c + m*(s.charAt(i) - 'A' + 1);
            m = m*26;
        }
        return c;
    }
}
```