## First Solution

```java
class Solution {
    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        int count = 0;
        count += add(root, sum, 0);
        count += pathSum(root.left, sum);
        count += pathSum(root.right, sum);
        return count;
    }
    
    public int add(TreeNode root, int target, int previous) {
        if (root == null) return 0;
        int count = 0;
        previous += root.val;
        if (previous == target) {
            count++;
        }

        count += add(root.right, target, previous);
        count += add(root.left, target, previous);

        return count;
    }
}
```

## Second Solution

```java
class Solution {
    
    Map<Integer, Integer> h = new HashMap<>();
    
    public int pathSum(TreeNode root, int sum) {
        return pathSum(root, sum, 0);
    }
    
    private int pathSum(TreeNode rooty, int target, int sumy) {
        if (rooty == null) return 0;
        int count = 0;
        sumy += rooty.val; 
        int g = sumy - target;
        if (sumy == target) count++;
        if (h.containsKey(g)) count += h.get(g);
        
        h.put(sumy, h.getOrDefault(sumy, 0) + 1);
        
        count += pathSum(rooty.right, target, sumy);
        count += pathSum(rooty.left, target, sumy);
        
        h.put(sumy, h.get(sumy) - 1);
        
        return count;
    }
    
}
```

## Third Solution

```java
class Solution {
    
    Map<Integer, Integer> h = new HashMap<>();
    int count = 0;
    
    public int pathSum(TreeNode root, int sum) {
        ok(root, sum, 0);
        return count;
    }
    
    public void ok(TreeNode rooty, int target, int sumy) {
        if (rooty == null) return;
        sumy += rooty.val; 
        int g = sumy - target;
        
        if (sumy == target) count++;
        if (h.containsKey(g)) count += h.get(g);
        
        h.put(sumy, h.getOrDefault(sumy, 0) + 1);
        
        ok(rooty.right, target, sumy);
        ok(rooty.left, target, sumy);
        
        h.put(sumy, h.get(sumy) - 1);
    }
}
```