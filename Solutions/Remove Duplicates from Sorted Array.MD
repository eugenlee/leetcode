### First Solution

```java
import java.util.*;
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int l = nums.length;
        int unique = 0;
        
        for (int c = unique; c < l; c++) {
            if ((nums[unique] != nums[c])) {
                unique++;
                nums[unique] = nums[c];
            }
        }
    return unique+1;
    }
}
```

### Second Solution