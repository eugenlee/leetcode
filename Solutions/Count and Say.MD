### First Solution

```java
class Solution {
    public String countAndSay(int n) {
        String say = "1";
        int counter_n = 1;
        StringBuilder holder = new StringBuilder();
        while (counter_n < n) {
            counter_n++;
            holder.setLength(0);
            int l = say.length();
            int repeats = 1;
            int i = 0;
            while(i < l) {
                while (i + repeats < l && say.charAt(i) == say.charAt(i+repeats)) {
                    repeats++;
                }
                holder.append(Integer.toString(repeats)).append(say.charAt(i));
                i = i + repeats;
                repeats = 1;     
            }
            say = holder.toString();
        }
        return say;
    }
}
```

### Second Solution