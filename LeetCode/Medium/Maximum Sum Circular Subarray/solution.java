class Solution {
    public int maxSubarraySumCircular(int[] nums) {
    int a1=nums[0];
    int a2=nums[0];
    int maxsum=nums[0];
    int minsum=nums[0];
    int sum=nums[0];
    for(int i=1;i<nums.length;i++)
     {
       maxsum=Math.max(maxsum+nums[i],nums[i]);
       a1=Math.max(maxsum,a1);
       sum+=nums[i];
       minsum=Math.min(minsum+nums[i],nums[i]);
       a2=Math.min(minsum,a2);
     }
     if(a1<0)
     return a1;
     return Math.max(a1,sum-a2);
    }
}