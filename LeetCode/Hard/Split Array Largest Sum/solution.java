class Solution {
    boolean fun(int[] nums,int k,int sum){
        int k2=1;
        int s=0;
        for(int i=0;i<nums.length;i++){
            if(s+nums[i]<=sum){
                s+=nums[i];
            }
            else{
                k2++;
                s=nums[i];
            }
            if(k2>k)
            return false;
        }
        return true;
    }
    public int splitArray(int[] nums, int k) {
       int low=nums[0];
       int high=0;
       for(int i:nums){
        low=Math.max(i,low);
        high+=i;
       }
       int res=-1;
       while(low<=high){
        int sum=(low+high)/2;
        if(fun(nums,k,sum)){
            res=sum;
            high=sum-1;
        }
        else{
            low=sum+1;
        }
       }
       return res;
    }
}