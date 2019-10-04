### First Solution

```c
int maxProfit(int* prices, int pricesSize) {
    int maxpro = 0;
    int* ptr = &maxpro;
    for (int a = 0; a < pricesSize; a++){
        for (int b = a + 1; b < pricesSize; b++){
            if (prices[b] - prices[a] > maxpro){
                *ptr = prices[b] - prices[a];
            }
        }
    }
    return *ptr;
}
```

### Second Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int p = prices.length;
        int max = 0;
        for (int i = 0; i < p; i++) {
            for (int j = 1; j < p; j++) {
                if (prices[j] - prices[i] > max && j > i) {
                    max = prices[j] - prices[i];
                }
            }
        }
        return max;
    }
}
```

### Third Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int p = prices.length;
        for (int i = 0; i < p; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > max) {
                max = prices[i]-min;
            }
        }
        return max;
    }
}
```