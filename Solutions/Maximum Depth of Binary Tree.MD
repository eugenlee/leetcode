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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int max = 0;
        return traverse(root, max);
    }
        
    public int traverse(TreeNode x, int z) {
        if (x == null) return z;
        return Math.max(traverse(x.right, z+1), traverse(x.left,z+1));
    }
}
```

## Second Solution

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
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + maxDepth(root.right), 1 + maxDepth(root.left));
    }
}
```