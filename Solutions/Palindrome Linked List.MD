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
    
    ListNode node;
    
    public boolean isPalindrome(ListNode head) {
        
        if (head == null) return true;
        if (node == null) node = head;
        
        boolean b = isPalindrome(head.next);

        if (head.val == node.val) node = node.next;
    
        else return false;     
        
        return b;
    }    
}
```

## Second Solution

```java
class Solution {    
    public boolean isPalindrome(ListNode head) {
        // inspired by the great rodneyshag
        
        // find the 'midpoint' of the list
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        // for odd # nodes
        if (fast != null) slow = slow.next;
        
        // reverse that bitc
        ListNode center = reverseThatB(slow);
        
        // now compare those bs
        while (center != null) {
            if (center.val == head.val) {
                center = center.next;
                head = head.next;
            }
            else return false;
        }
        return true;
    }    
    
    public ListNode reverseThatB(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode n = curr.next;
            curr.next = prev;
            prev = curr;
            curr = n;
        }
        return prev;
    }
}
```