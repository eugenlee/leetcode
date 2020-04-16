## First Solution

```java
class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> s = new HashMap<>();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < nums1.length; i++) {
            s.put(nums1[i], s.getOrDefault(nums1[i],0) + 1);
        }
        
        for (int j = 0; j < nums2.length; j++) {
            if (s.get(nums2[j]) != null && s.get(nums2[j]) > 0) {
                l.add(nums2[j]);
                s.put( nums2[j], s.get(nums2[j])-1 );
            }
        }
        int si = l.size();
        int[] fin = new int[si];
        int i = 0;
        for (Integer o : l) fin[i++] = o;
        return fin;
    }
}
```