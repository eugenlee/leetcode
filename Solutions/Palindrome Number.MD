### First Solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0){
            return false;
        }
        String nx = Integer.toString(x);
        int m = nx.length();
        if (m == 1){
            return true;}
        else{
            for (int i = 0; i < m-1 && i != m; i++){
                if (nx.charAt(i) == nx.charAt(m-1)){
                    m--;
                    continue;}
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
```

### Second Solution

```java
class Solution {
    public boolean isPalindrome(int x) {
        if ( x < 0 || (x % 10 == 0 && x != 0) ){
            return false;
        }
        
        int hol = 0;
        
        while ( x > hol ){
            hol = hol*10 + x % 10;
            x /= 10;
        }
        
        return x == hol || x == hol/10;
    }
}
```