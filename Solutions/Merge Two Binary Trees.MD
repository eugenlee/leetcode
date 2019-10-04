## First Solution

```java
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        
        t1.val += t2.val;
        
        TreeNode right = mergeTrees(t1.right, t2.right);
        TreeNode left = mergeTrees(t1.left, t2.left);
    
        t1.right = right;
        t1.left = left;
        
        return t1;
    }
}
```

## Second Solution

```java
class Solution {
    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) return t2;
        if (t2 == null) return t1;
        
        t1.val += t2.val;
        
        t1.right = mergeTrees(t1.right, t2.right);
        t1.left = mergeTrees(t1.left, t2.left);
        
        return t1;
    }
}
```