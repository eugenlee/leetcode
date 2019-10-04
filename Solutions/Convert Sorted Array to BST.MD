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
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length - 1;
        return sat(nums, 0, l);
    }
    public TreeNode sat(int[] nums, int start, int end) {
        if (start > end) return null;
        int mid = (start + end + 1)/2;
        TreeNode ne = new TreeNode(nums[mid]);
        ne.left = sat(nums, start, mid-1);
        ne.right = sat(nums, mid+1, end);
        return ne;
    }
}

/*
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int l = nums.length;
        if (l == 0) return null;
        int mid = l/2;
        int j = 0;
        int y = l-1;
        
        TreeNode root = new TreeNode(nums[mid]);
        TreeNode current = root;
        TreeNode other = root;
        
        for (int i = mid-1; i != -1; i--) {
            current.left = new TreeNode(nums[i]);
            if (j == 0 && y > mid) {
                current.right = new TreeNode(nums[y]);
                other = other.right;
            }
            if (j > 0 && y != mid) {
                current.right = null;
                other.left = new TreeNode(nums[y]);
                other.right = null;
                other = other.left;
            }
            y--;
            j++;
            current = current.left;
        }
        return root;
    }
} */
```