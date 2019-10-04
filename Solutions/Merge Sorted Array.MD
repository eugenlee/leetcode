### First Solution

```java
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (m == 0) System.arraycopy(nums2, 0, nums1, 0, n);
        if (n != 0) {
            int l = nums1.length;
            int[] a = new int[m];
            System.arraycopy(nums1, 0, a, 0, m);
            int j = 0;
            int z = 0;
            
            for (int i = 0; i < l; i++) {
                if (z < m && j < n && a[z] < nums2[j]) {
                    nums1[i] = a[z];
                    z++;
                }
                else if (j < n) {
                    nums1[i] = nums2[j];
                    j++;
                }
                else {
                    nums1[i] = a[z];
                    z++;
                }
            }
        }
    }
}
```