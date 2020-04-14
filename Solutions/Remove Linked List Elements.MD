## First Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode fh = new ListNode(0);
        fh.next = head;
        ListNode slow = fh;
        ListNode fast = fh;
        
        while (slow != null) {
            if (fast.next == null) break;
            if (fast.next.val == val) {
                fast = fast.next;
                while (fast != null && fast.val == val) fast = fast.next;
                slow.next = fast;
                slow = slow.next;
            }
            else {
                fast = fast.next;
                slow = slow.next;
            }
        }
        return fh.next;
    }
}
```