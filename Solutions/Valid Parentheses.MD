### First Solution

```java
import java.util.*; 
import java.io.*; 

class Solution {
    public boolean isValid(String s) {
        Hashtable <Character, Character> h = new Hashtable <Character, Character>();
        h.put(')', '(');
        h.put(']', '[');
        h.put('}', '{');
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) { 
            if (h.containsKey(s.charAt(i)) && stack.empty() == false) {
                if (stack.peek() == h.get(s.charAt(i))) {
                    stack.pop();
                }
                else {
                    stack.push(s.charAt(i));
                }
            }
            else {
                stack.push(s.charAt(i));
                Character element = stack.peek(); 
                System.out.println(element);
            }
        } 
        return stack.empty();
    }
}
```

### Second Solution

```java
import java.util.*; 
import java.io.*; 

class Solution {
    public boolean isValid(String s) {
        Hashtable <Character, Character> h = new Hashtable <Character, Character>();
        h.put(')', '(');
        h.put(']', '[');
        h.put('}', '{');
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) { 
            if (h.containsKey(s.charAt(i)) && stack.empty() == false) {
                if (stack.peek() == h.get(s.charAt(i))) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(s.charAt(i));
                Character element = stack.peek(); 
                System.out.println(element);
            }
        } 
        return stack.empty();
    }
}
```

### Third Solution

```java
import java.util.*; 
import java.io.*; 

class Solution {
    public boolean isValid(String s) {
        Hashtable <Character, Character> h = new Hashtable <Character, Character>();
        h.put(')', '(');
        h.put(']', '[');
        h.put('}', '{');
        
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) { 
            char c = s.charAt(i);
            if (h.containsKey(c) && stack.empty() == false) {
                if (stack.peek() == h.get(c)) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
            else {
                stack.push(c);
            }
        }
        return stack.empty();
    }
}
```