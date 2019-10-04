## First Solution

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> out = new ArrayList<List<Integer>>();
        if (numRows == 0) return out;
        
        out.add(new ArrayList<>());
        out.get(0).add(1);

        for (int i = 1; i < numRows; i++) {       
            out.add(new ArrayList<>());
            out.get(i).add(1);
            List<Integer> prev = out.get(i-1);

                for (int j = 1; j < i && i >= 2; j++) {
                    out.get(i).add(prev.get(j-1) + prev.get(j));
                }
            
            out.get(i).add(1);
        }
        return out;
    }
}
```

## Second Solution

```java
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                }
                else {
                    List<Integer> prev = res.get(i - 1);
                    int sum = prev.get(j - 1) + prev.get(j);
                    row.add(sum);
                }
            }
            res.add(row);
        }
        return res;
    }
}
```