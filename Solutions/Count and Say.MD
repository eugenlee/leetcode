### First Solution

```java
class Solution {
    public String countAndSay(int n) {
        if (n == 1) {
            return "1";
        }
        else if (n == 2) {
            return "11";
        }
        else {
            String say = "11";
            int counter_n = 2;
            String holder = "";
            
            while (counter_n < n) {
                
                counter_n++;
                holder = "";
                int l = say.length();
                int repeats = 1;
                int i = 0;
                
                while(i < l) {
                    
                    /*check how many repeat values there are*/
                    while (i + repeats < l && say.charAt(i) == say.charAt(i+repeats)) {
                        repeats++;
                    }
                    
                    if (repeats > 1) {
                    holder = holder + Integer.toString(repeats) + say.charAt(i);
                    i = i + repeats;
                    repeats = 1;
                    }
                    
                    else {
                        holder = holder + Integer.toString(repeats) + say.charAt(i);
                        i++;
                    }
                    
                    System.out.println(holder);

                }
                
                say = holder;
            }
            
            return say;
        }
    }
}
```

### Second Solution

```java
class Solution {
    public String countAndSay(int n) {
        
        String say = "1";
        int counter_n = 1;
        StringBuilder holder = new StringBuilder();

        while (counter_n < n) {

            counter_n++;
            holder.setLength(0);
            int l = say.length();
            int repeats = 1;
            int i = 0;

            while(i < l) {
                /*check how many repeat values there are*/
                while (i + repeats < l && say.charAt(i) == say.charAt(i+repeats)) {
                    repeats++;
                }
                
                holder.append(Integer.toString(repeats)).append(say.charAt(i));
                i = i + repeats;
                repeats = 1;
                
            }

            say = holder.toString();
        }

        return say;
    }
}
```