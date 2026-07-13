
class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int count=0;
        int low=0;
        int res=Integer.MIN_VALUE;
        for(int high=0;high<n;high++){
         if(nums[high]==0)
         count++;
         while(count>k){
            if(nums[low]==0)
            count--;
            low++;
         }
         int len=high-low+1;
         res=Math.max(res,len);
        }
        return res;
    }
}