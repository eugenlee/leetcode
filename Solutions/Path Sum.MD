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
    
    public boolean hasPathSum(TreeNode root, int sum) {    
        if (root == null) return false;
        return Sum(root, sum, 0);
    }
    
    public boolean Sum(TreeNode root, int target, int previous) {
        if (root == null) return false;
        previous += root.val;
        return previous == target && root.left == null && root.right == null || 
                Sum(root.left, target, previous) == true || 
                Sum(root.right, target, previous) == true;
    }
}
```

## Second Solution

```java
class Solution {
    
    public boolean hasPathSum(TreeNode root, int sum) {    
        if (root == null) return false;
                
        if (sum == root.val && root.left == null && root.right == null) {
            return true;
        }
        
        return hasPathSum(root.left, sum-root.val) || 
            hasPathSum(root.right, sum-root.val);
    }
}
```