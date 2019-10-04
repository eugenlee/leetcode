## First Solution

```java
class Solution {
    public boolean isHappy(int n) {
        int remain = 0;
        while (n != 0) {
            remain += Math.pow(n%10,2);
            n = n/10;
        }
        if (remain == 1) return true;
        else if (n == 4 || remain == 4) return false;
        return isHappy(remain);
    }
}
```

## Second Solution

```java
class Solution {
    public boolean isHappy(int n) {
        while (n != 1 && n != 4) {
            int remain = n;
            n = 0;
            while (remain > 0) {
                int z = remain % 10;
                n += z*z;
                remain /= 10;
            }
        }
        return n == 1;
    }
}
```