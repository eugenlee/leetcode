### First Solution

```java
class Solution {
    public int romanToInt(String s) {
        int nu = 0;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) == 'V'){
                nu += 5;}        
            if (s.charAt(i) == 'L'){
                nu += 50;}
            if (s.charAt(i) == 'D'){
                nu += 500;}
            if (s.charAt(i) == 'M'){
                nu += 1000;}
            
            if (s.charAt(i) == 'C'){
                if ( (i < s.length() - 1 ) && s.charAt(i+1) == 'D'){
                    nu += 400;
                    i+=1;}
                else if ( (i < s.length() - 1 ) && s.charAt(i+1) == 'M'){
                    nu += 900;
                    i+=1;
                }
                else{
                    nu += 100;
                }
            }
            
            if (s.charAt(i) == 'X'){
                if ( (i < s.length() - 1 ) && s.charAt(i+1) == 'L'){
                    nu += 40;
                    i+=1;
                }
                else if ( (i < s.length() - 1 ) && s.charAt(i+1) == 'C'){
                    nu += 90;
                    i+=1;
                }
                else{
                    nu += 10;}
            }
            
            if (s.charAt(i) == 'I'){
                if ( (i < s.length() - 1) && (s.charAt(i+1) == 'V') ){
                    nu += 4;
                    i+=1;
                }
                else if ( (i < s.length() - 1 ) && s.charAt(i+1) == 'X'){
                    nu += 9;
                    i+=1;
                }
                else{
                    nu += 1;
                }
            }
        }
        return nu;
    }
}
```