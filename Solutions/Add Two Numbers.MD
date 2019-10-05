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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        // first find which one is longer
        ListNode a = l1; ListNode b = l2; int el1 = 0; int el2 = 0;
        while (a != null && b != null) {
            a = a.next;
            b = b.next;
        }
        
        if (b == null) {
            a = l1;
            b = l2;
            el1++;
        }
        else {
            a = l2;
            b = l1;
            el2++;
        }
        
        // now do the addition + carrying
        int carry = 0;
        int value = 0;
        while (a!= null || (b != null && carry == 0)) {
            value = (b != null) ? a.val+b.val+carry : a.val+carry;
            if (value < 10) {
                a.val = value;
                carry = 0;
                a = a.next;
                if (b != null) b = b.next;
            }
            else {
                a.val = value%10;
                carry = value/10;
                if (a.next == null) {
                    a.next = new ListNode(carry);
                    break;
                }
                a = a.next;
                if (b != null) b = b.next;
            }
        }
        
        return el2 == 0 ? l1 : l2;
    }
}
```

## Second Solution

```java
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(0);
        ListNode a = l1, b = l2, p = head;
        int carry = 0, add1 , add2, value;
        while (a!= null || b != null) {
            add1 = (a != null) ? a.val : 0;
            add2 = (b != null) ? b.val : 0;
            value = add1 + add2 + carry;
            p.next = new ListNode(value%10);
            carry = value/10;
            p = p.next;
            if (a != null) a = a.next;
            if (b != null) b = b.next;
        }
        
        if (carry != 0) {
            p.next = new ListNode(carry);
        }
        
        return head.next;
    }
}
```
## 2nd solution not in-place, therefore slower in time and memory