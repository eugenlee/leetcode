## First Solution

```java
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String bina = Integer.toBinaryString(n);
        StringBuilder b = new StringBuilder();
        int l = bina.length();
        int zeroes = 32-l;
        long answer = 0;
        int i = 0;
        for (int c = l-1; c > -1; c--) {
            b.append(bina.charAt(c));
        }
        for (int z = 0; z < zeroes; z++) {
            b.append('0');
        }
        int si = b.length();
        int m = 31;
        for (int c = 0; c < si; c++) {
            if (b.charAt(c) == '1') answer += Math.pow(2,m);
            m--;
        }
        return (int) answer;
    }
}
```

## Second Solution

```java
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int reb = 0;
        for (int i = 0; i < 32; i++) {
            reb |= (n&1);
            n >>= 1;
            if (i < 31) reb <<= 1;
        }
        return reb;
    }
}
```