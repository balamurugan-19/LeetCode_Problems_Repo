
import java.util.Arrays;

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[Math.min(nums1.length,nums2.length)];
        boolean[] u = new boolean[nums2.length];
        int b = 0;
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            for (int k = 0; k < b; k++) {
                if (arr[k] == nums1[i]) {
                    found = true;
                    break;
                }
            }

            if (found) {
                continue;
            }

            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j] && !u[j]) {
                    arr[b] = nums1[i];
                    b++;
                    u[j] = true;
                    break;
                }
            }
        }

        return Arrays.copyOf(arr, b);
    }
}
