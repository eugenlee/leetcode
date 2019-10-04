## First Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = s.length();
        char[] normal = new char[l];
        int i;
        int j = 0;
        for (i = 0; i < l; i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                normal[j] = s.charAt(i);
                j++;
            }
        }
        char[] abnormal = new char[l];
        j = 0;
        for (i = normal.length-1; i > -1; i--) {
            if (Character.isLetter(normal[i]) || Character.isDigit(normal[i])) {
                abnormal[j] = normal[i];
                j++;
            }
        }
        System.out.println(normal);
        System.out.println(abnormal);
        return Arrays.equals(normal,abnormal);
    }
}
```

## Second Solution

```java
class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = s.length();
        char[] normal = new char[l];
        int i;
        int j = 0;
        for (i = 0; i < l; i++) {
            if (Character.isLetter(s.charAt(i)) || Character.isDigit(s.charAt(i))) {
                normal[j] = s.charAt(i);
                j++;
            }
        }
        char[] abnormal = new char[l];
        j = 0;
        for (i = normal.length-1; i > -1; i--) {
            if (Character.isLetter(normal[i]) || Character.isDigit(normal[i])) {
                abnormal[j] = normal[i];
                j++;
            }
        }
        return Arrays.equals(normal,abnormal);
    }
}
```