## First Solution

```java
class Solution {
    public int trailingZeroes(int n) {
        int zeroes = 0;
        while (n/5 != 0) {
        zeroes += n/5;
        n /= 5;
        }
        return zeroes;
    }
}
```