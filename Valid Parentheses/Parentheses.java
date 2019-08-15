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