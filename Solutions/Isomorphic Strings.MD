## First Solution

```java
class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> h = new HashMap<>();
        int l = s.length();
        String blank = "";
        for (int i = 0; i<l; i++) {
            Character find = s.charAt(i);
            if (h.containsKey(find)) blank += h.get(find);
            else if (!h.containsValue(t.charAt(i))){
                blank += t.charAt(i);
                h.put(find, t.charAt(i));
            }
            else return false;
        }
        return blank.equals(t);
    }
}
```