## First Solution

```java
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode b = head;
        head = head.next;
        while (b != head) {
            if (head == null || head.next == null) return false;
            b = b.next;
            head = head.next.next;
        }
        return true;
    }
}
```

## Second Solution

```java
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode b = head;
        head = head.next;
        while (head != null) {
            if (head == b) return true;
            else {
                b = b.next; 
                if (head == null || head.next == null) return false;
                head = head.next.next;
            }
        }
        return false;
    }
}
```