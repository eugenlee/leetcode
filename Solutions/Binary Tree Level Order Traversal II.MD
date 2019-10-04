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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> a1 = get(root, 0);
        List<List<Integer>> a2 = new ArrayList<>();
        int s = a1.size()-1;
        for (int i = s; i > -1; i--) {
            a2.add(a1.get(i));
        }
        return a2;
    }
    
    List<List<Integer>> a = new ArrayList<>();
    public List<List<Integer>> get(TreeNode root, int p) {
        if (root == null) return a;
        if (a.size() <= p) a.add(new ArrayList<>());
        a.get(p).add(root.val);
        get(root.left, p+1);
        get(root.right, p+1);
        return a;
    }
}
```

## Second Solution

```java
class Solution {
    List<List<Integer>> a = new ArrayList<>();

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        if (root == null) return a;
        List<List<Integer>> a1 = get(root, 0);
        List<List<Integer>> a2 = new ArrayList<>();
        int s = a1.size()-1;
        for (int i = s-1; i > -1; i--) {
            a2.add(a1.get(i));
        }
        return a2;
    }
    
    public List<List<Integer>> get(TreeNode root, int p) {
        if (root == null) return a;
        else if (p==0) {
            List<Integer> u = new ArrayList<>();
            u.add(root.val);
            a.add(u);
            p++;
        }
        if (a.size() <= p) a.add(new ArrayList<>());
        else if (root.left == null && root.right == null) return a;
        if (root.left != null) a.get(p).add(root.left.val);
        if (root.right != null) a.get(p).add(root.right.val);
        get(root.left, p+1);
        get(root.right, p+1);
        return a;
    }
}
```