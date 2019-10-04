## First Solution

```java
class Solution {
    public int getSum(int a, int b) {
        return a+b;
    }
}
```

## Second Solution

```java
class Solution {
    public int getSum(int a, int b) {
        while (b != 0){
            int carry = (a & b) ;

            a = a ^ b; 

            b = carry << 1;
        }
        return a;
    }
}
```

## Third Solution

```java
class Solution {
    public int getSum(int a, int b) {
        return b == 0 ? a : getSum(a^b, (a&b)<<1);
    }
}
```