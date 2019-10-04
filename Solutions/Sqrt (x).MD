### First Solution

```java
class Solution {
    public int mySqrt(int x) {
        
        if (x < 2) return x;
        
        int test = (int) Math.pow(Math.E, 0.5*Math.log(x));
        
        int za = test + 1;
        return (long) za*za > x ? test : za;
        
    }
}
```

### Second Solution

```java
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        int p = 0, left = 2, right = x/2;
        long result;
        while (left <= right) {
            p = left + (right - left)/2;
            result = (long) p*p;
            if (result > x) right = p-1;
            else if (result < x) left = p+1;
            else return p;
        }
        
        return right;
    }
}
```

### Third Solution

```java
class Solution {
    public int mySqrt(int x) {
        if (x < 2) return x;
        
        double x0 = x;
        double x1 = 0.5*(x0 + x/x0);
        
     while (Math.abs(x1-x0) >= 1) {
         x0 = x1;
         x1 = 0.5*(x0 + x/x0);
    }
        return (int) x1;
    }
}
```