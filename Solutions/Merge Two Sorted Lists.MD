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
            ListNode first = new ListNode(0);
            ListNode track = first;
            
            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    track.next = l1;
                    l1 = l1.next;
                    track = track.next;
                    if (l1 == null) {
                        track.next = l2;
                        return first.next;
                    }
                }
                else {
                    track.next = l2;
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