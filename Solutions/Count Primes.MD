## First Solution

```java
class Solution {
    public int countPrimes(int n) {
        int counter = 0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)) counter++;
        }
        return counter;
    }
    
    private boolean isPrime(int n) {
        for (int j = 2; j*j <= n; j++) {
            if (n%j==0) return false;
        }
        return true;
    }
}
```

## Second Solution

```java
class Solution {
    public int countPrimes(int n) {
        int counter = 0;
        for (int i = 2; i < n; i++) {
            counter += isPrime(i);
        }
        return counter;
    }
    
    private int isPrime(int n) {
        for (int j = 2; j*j <= n; j++) {
            if (j==n || n%j==0) return 0;
        }
        return 1;
    }
}
```