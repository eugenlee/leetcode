## First Solution

```java
class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;
        int p = prices.length;
        if (p == 0) return 0;
        for (int i = 0; i < p; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            else if (prices[i] - min > 0) {
                max += prices[i]-min;
                min = prices[i];
            }
        }
        return max;
    }
}
```