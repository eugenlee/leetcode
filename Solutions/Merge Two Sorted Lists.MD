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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    
        /* need to add check if the listnodes are [] */
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else {
            /* create random track node */
            ListNode first = new ListNode(-8);
            ListNode track = first;
            
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    ListNode z = new ListNode(l1.val);
                    track.next = z;
                    l1 = l1.next;
                    track = track.next;
                    if (l1 == null) {
                        track.next = l2;
                        return first.next;
                    }
                }
                if (l2.val < l1.val) {
                    ListNode z = new ListNode(l2.val);
                    track.next = z;
                    l2 = l2.next;
                    track = track.next;
                    if (l2 == null) {
                        track.next = l1;
                        return first.next;
                    }
                }
            }
            return null;
        }
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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        else if (l2 == null) return l1;
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }
}
```