### First Solution

```java
class Solution {
    public String addBinary(String a, String b) {
        // figure out which string is longer (seems easiest)
        boolean q = a.length() >= b.length();
        String longer = q ? a : b;
        String shorter = q ? b: a;
        int l = longer.length();
        int s = shorter.length()-1;
        
        // stringbuilder for addition (although backwards)
        StringBuilder backwards = new StringBuilder();
        int carry = 0;
        int sum = 0;
        if (shorter.equals("0")) return longer;
        
        // begin iterations of longest string for addition
        // using 4 condition sum of values to determine whether to carry or not 1
        for (int i = l-1; i > -1; i--) { 
            if (s >= 0) {
                sum = carry + Character.getNumericValue(longer.charAt(i)) + 
                    Character.getNumericValue(shorter.charAt(s));
            }
            else {
                sum = carry + Character.getNumericValue(longer.charAt(i));
            }
            if (s < 0 && carry == 0) backwards.append(longer.charAt(i));
            else if (sum == 0) { 
                backwards.append("0");
                carry = 0;
            }
            else if (sum == 1) { 
                backwards.append("1");
                carry = 0; 
            }
            else if (sum == 2) {
                backwards.append("0");
                carry = 1;
            }
            else if (sum == 3) {
                backwards.append("1");
                carry = 1;
            }
            
            s--;
        }
        
        // leftover 1, add
        if (carry == 1) backwards.append("1");
        String answer = "";
        
        // reverse that b
        for (int j = backwards.length()-1; j > -1 ; j--) {
            answer += backwards.charAt(j);
        }
                
        return answer;
    }
}
```

### Second Solution

```java
class Solution {
    public String addBinary(String a, String b) {
        // figure out which string is longer (seems easiest)
        boolean q = a.length() >= b.length();
        String longer = q ? a : b;
        String shorter = q ? b: a;
        int l = longer.length();
        int s = shorter.length()-1;
        
        // stringbuilder for addition (although backwards)
        StringBuilder backwards = new StringBuilder();
        int carry = 0;
        int sum = 0;
        if (shorter.equals("0")) return longer;
        
        // begin iterations of longest string for addition
        // using 4 condition sum of values to determine whether to carry or not 1
        for (int i = l-1; i > -1; i--) { 
            int ye = carry + Character.getNumericValue(longer.charAt(i));
            sum = (s >= 0) ? ye + Character.getNumericValue(shorter.charAt(s)) : ye;
            if (s < 0 && carry == 0) backwards.insert(0, longer.charAt(i));
            else {
                switch (sum) {
                    case 0:
                        backwards.insert(0, "0");
                        carry = 0;
                        break;
                    case 1:
                        backwards.insert(0, "1");
                        carry = 0;
                        break;
                    case 2: 
                        backwards.insert(0, "0");
                        carry = 1;
                        break;
                    case 3: 
                        backwards.insert(0, "1");
                        carry = 1;
                        break;
                }
            }
            s--;
        }
        
        // leftover 1, add
        if (carry == 1) backwards.insert(0, "1");
        String answer = "";
        
        return backwards.toString();
    }
}
```