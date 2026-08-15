class Solution {
    public int maxAbsoluteSum(int[] nums) {
       int maxsum=nums[0];
       int minsum=nums[0];
       int res=Math.abs(nums[0]);
       for(int i=1;i<nums.length;i++){
        maxsum=Math.max(maxsum+nums[i],nums[i]);

        minsum=Math.min(minsum+nums[i],nums[i]);
        res=Math.max(res,Math.max(maxsum,-minsum));

       } 
       return res;
    }
}