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
    public ListNode reverseList(ListNode head) {
        Stack h = new Stack<Integer>();
        if (head == null) return head;
        while (head != null) {
            h.push(head.val);
            head = head.next;
        }
        ListNode rev = new ListNode(Integer.parseInt(h.pop().toString()));
        ListNode a = rev;
        while (h.empty() == false) {
            int p = Integer.parseInt(h.pop().toString());
            a.next = new ListNode(p);
            a = a.next;
        }
        return rev;
    }
}
```

## Second Solution

```java
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode temp = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return temp;
    }
}
```