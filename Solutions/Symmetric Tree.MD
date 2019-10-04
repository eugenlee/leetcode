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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;        
        LinkedList<TreeNode> o = new LinkedList<> ();
        o.add(root.left);
        o.add(root.right);
        
        while (!o.isEmpty()) {
            
            TreeNode j = o.poll();
            TreeNode k = o.poll();
            
            if (j == null && k == null) continue;
            if (j == null || k == null) return false;
            if (j.val != k.val) return false;
            
            o.add(j.left);
            o.add(k.right);
            o.add(j.right);
            o.add(k.left);
        }
        return true;
    }
}
```

## Second Solution

```java
class Solution {
    
    public boolean isSymmetric(TreeNode root) {
        if (root == null) return true;
        return check(root.left, root.right);
    }
    
    public boolean check(TreeNode x, TreeNode y) {
        if (x == null && y == null) return true;
        if (x == null || y == null) return false;
        if (x.val != y.val) return false;
        
        TreeNode a = x.left;
        TreeNode b = y.right;
        TreeNode c = x.right;
        TreeNode d = y.left;
    
        return check(a, b) && check(c, d);
    }
}
```