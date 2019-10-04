## First Solution

```java
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int c = 0;
        String bina = Integer.toBinaryString(n);
        if (bina.indexOf("1") == -1) return 0;
        for (int i = bina.indexOf("1"); i < bina.length(); i++) {
            if (bina.charAt(i) == '1') c++;
        }
        return c;
    }
}
```

## Second Solution

```java
public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
    int sum = 0;
    while (n != 0) {
        sum++;
        n &= (n - 1);
    }
    return sum;
}
}
```