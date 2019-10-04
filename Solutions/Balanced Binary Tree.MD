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
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        else if (root.left == null && root.right == null) return true;
        else if (root.left == null && max(root.right) > 1) return false;
        else if (root.right == null && max(root.left) > 1) return false;
        else if (Math.abs( max(root.left) - max(root.right) ) > 1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    public int max(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + max(root.left), 1 + max(root.right));
        }
}
```

## Second Solution

```java
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null) return true;
        int right = max(root.right);
        int left = max(root.left);
        if (Math.abs(right-left) > 1) return false;
        
        return isBalanced(root.left) && isBalanced(root.right);
        
    }
    
    public int max(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + max(root.left), 1 + max(root.right));
        }
}
```