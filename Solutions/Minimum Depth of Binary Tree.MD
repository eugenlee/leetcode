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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        int left = 1 + minDepth(root.left);
        int right = 1 + minDepth(root.right);
        int not_one = 0;
        boolean check = (left == 1 && right == 1);
        if (!check && left == 1) not_one = right;
        else if (!check && right == 1) not_one = left;
        else not_one = right < left ? right : left;
        return (check == true) ? 1 : not_one;
    }
}
```