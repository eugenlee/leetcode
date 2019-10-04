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
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
            List<Integer> a = new ArrayList<>();
        
        while (root.right != null || root.left != null) {
            int r = max(root.right);
            int l = max(root.left);
            a.add(r+l);
            root = (r > l ? root.right : root.left);
        }
        
        int m = 0;
        
        for (Integer n : a) 
            if (n > m) m = n;
        return m;
    }
    
    public int max(TreeNode root) {
        if (root == null) return 0;
        return Math.max(1 + max(root.right), 1 + max(root.left));
    }
}
```