### First Solution

```java
class Solution {
    public int lengthOfLastWord(String s) {
        int l = s.length();
        int c = 0;
        for (int i = l-1; i > -1; i--) {
            if (Character.isLetter(s.charAt(i))) c++;
            else if (c > 0 && Character.isLetter(s.charAt(i)) == false) return c;
        }
        return c;
    }
}
```