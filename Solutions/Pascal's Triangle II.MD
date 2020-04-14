## First Solution

```java
class Solution {
    List<Integer> out = new ArrayList<>();
    
    public List<Integer> getRow(int rowIndex) {
        
        for (int i = 0; i <= rowIndex; i++) {
            List<Integer> temp = new ArrayList<>();
            
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) temp.add(1);
                else temp.add(out.get(j-1) + out.get(j));
                if (j == i) out = temp;
            }
            
            
        }
        return out;
    }
}
```

## Second Solution

```java
class Solution {
    
    public List<Integer> getRow(int rowIndex) {
        List<Integer> out = new ArrayList<>();
        List<Integer> temp = out;

        for (int i = 0; i <= rowIndex; i++) {
            temp = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) temp.add(1);
                else temp.add(out.get(j-1) + out.get(j));
            }
            out = temp;
        }
        
        return out;
    }
}
```

## Third Solution

```java
class Solution {
    
     public List<Integer> getRow(int n) {

        List<Integer> list = new ArrayList<>(n+1);
        list.add(1);
        for(int r=1;r<n+1;r++){
            // r == i
            // n = rowIndex
            // Using formula
            // nCr = nCr-1*(n-r+1)/r
            Integer val = (int) ((((long)list.get(r-1))*(n-r+1))/(r));
            list.add(val);
        }
        return list;
        
    }
}
```