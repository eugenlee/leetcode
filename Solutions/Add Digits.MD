## First Solution

```java
class Solution {
    public int addDigits(int num) {
        int sum = 0;
        while (true) {
            sum += num % 10;
            num /= 10;
            if (num == 0 && sum < 10) break;
            else if (num == 0) {
                num = sum;
                sum = 0;
            }
        }
        return sum;
    }
}
```

## Second Solution

```java
class Solution {
    public int addDigits(int num) {
        return (num-1)%9+1;
    }
}
```