### First Solution

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
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return head;
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            if (fast.next.val == fast.val) fast = fast.next;
            else {
                slow.next = fast.next;
                slow = slow.next;
                fast = fast.next;
            }
        }
        if (slow.next != null) slow.next = null;
        return head;
    }
}
```

### Second Solution

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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode f = head;
        while (f != null && f.next != null) {
            if (f.next.val == f.val) {
                f.next = f.next.next;
            }
            else f = f.next;
        }
        return head;
    }
}
```