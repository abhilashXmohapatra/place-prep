class Solution {
    public int removeDuplicates(int[] nums) {
        int u=2;
        int i=1;
        for (int j=2;j<nums.length;j++){
            if(nums[j]!=nums[i-1]){
                nums[i+1]=nums[j];
                u++;
                i++;
            }
        }
        return u;
    }
}