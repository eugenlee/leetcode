### First Solution

```java
class Solution {
    public int[] plusOne(int[] digits) {
        int l = digits.length;        
        int p = l;
        
        if (digits[l-1] == 9) {
            l--;
            digits[l] += 1;
            
            while (digits[l] == 10 && l != 0) {
                digits[l] = 0;
                digits[l-1] += 1;
                l--;
            }
            
            if (digits[0] == 10) {
                int[] digi = new int[p+1];
                System.arraycopy(digits, 0, digi, 0, p-1);
                digi[0] = 1;
                return digi;
            }
            return digits;
        }
        
        digits[l-1] += 1;
        return digits;
    }
}
```