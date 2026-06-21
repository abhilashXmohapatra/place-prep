import java.util.Arrays;
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int right=0;
        for(int left=m;left<m+n;left++){
            nums1[left]=nums2[right];
            right++;
        }
        Arrays.sort(nums1);
    }
}