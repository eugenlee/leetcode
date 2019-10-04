## First Solution

```java
class Solution {
    public void reverseString(char[] s) {
        int l = s.length;
        int ind = 0;
        for (int i = l-1; i >= l/2; i--) {
            char beginning = s[ind];
            char end = s[i];
            s[i] = beginning;
            s[ind] = end;
            ind++;
        }
    }
}
```