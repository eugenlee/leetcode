## First Solution

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        if (n == 0 || (n < 3 && n != 1)) return false;
        while (n >= 3) {
            if (n % 3 == 0) n = n/3;
            else return false;
        }
        if (n == 1) return true;
        return false;
    }
}
```

## Second Solution

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        // return n > 0 && 1162261467%n==0;
        if (n > 1)
        while (n%3 == 0)
            n /= 3;
        return n == 1;
    }
}
```

## Third Solution

```java
class Solution {
    public boolean isPowerOfThree(int n) {
        return n > 0 && 1162261467 % n == 0;
    }
}
```