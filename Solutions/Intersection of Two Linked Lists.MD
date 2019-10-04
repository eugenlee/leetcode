## First Solution

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int a = 0;
        int b = 0;
        ListNode a1 = headA;
        ListNode b1 = headB;
        while (a1 != null) {
            a1 = a1.next;
            a++;
        }
        while (b1 != null) {
            b1 = b1.next;
            b++;
        }
        for (int i = 0; i < Math.abs(a-b); i++) {
            if (a < b) headB = headB.next;
            else headA = headA.next;
        }
        while (headA != null && headB != null) {
            if (headA == headB) return headA;
            else {
                headA = headA.next;
                headB = headB.next;
            }
        }
        return null;
    }
}
```

## Second Solution

```java
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode a = headA;
        ListNode b = headB;
        
        while(a != b) {
            a = (a == null) ? headB : a.next;
            b = (b == null) ? headA : b.next;
    }
        return a;
    }
}
```