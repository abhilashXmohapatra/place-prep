class Solution {
    public int findMin(int[] nums) {
     int res=-1;
     int left=0;
     int n=nums.length;
     int right=n-1;
     while(left<=right){
        int mid=(left+right)/2;
        if(nums[mid]>nums[n-1]){
            left=mid+1;
        }
        else{
            res=mid;
            right=mid-1;
        }
     }
     return nums[res];
    }
}