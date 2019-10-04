### First Solution

```java
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = nums.length;
        int unique = 1;
        
        for (int i = 0; i < l; i++) {
            if (nums[i] >= nums[l-1]) {
                break;
            }
            for (int c = unique; c < l; c++) {
                if ((nums[i] != nums[c]) && (nums[c] > nums[i])) {
                    nums[i+1] = nums[c];
                    unique++;
                    break;
                }
            }
        }
        return unique;
    }
}
    
```

### Second Solution

```java
class Solution {
    public int removeDuplicates(int[] nums) {
        int l = nums.length;
        int u = 0;
        for (int i = u; i < l; i++) {
            if (nums[i] != nums[u])
                u++;
                nums[u] = nums[i];
        }
        return u+1;
    }
}
```