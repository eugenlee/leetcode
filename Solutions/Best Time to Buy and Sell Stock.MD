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