class Solution {
    public int removeDuplicates(int[] nums) {
        int left=0;
        int k=1;
        int right=1;
        while(right<nums.length){
            if(nums[right]==nums[right-1]){
                right++;
                continue;
            }
            nums[left+1]=nums[right];
            k++;
            left++;
            right++;
        }
        return k;
    }
}