class Solution {
    public int search(int[] nums, int target) {
       int left=0;
       int n=nums.length;
       int right= n-1;
       while(left<=right)
       {
        int mid=(left+right)/2;
        //part 1
        if(nums[mid]==target)
        return mid;
        if(nums[mid]>nums[n-1])
        {
           if(nums[mid]<target)
            left=mid+1;
           else
           {
            if(nums[0]>target)
              left=mid+1;
            else
            right=mid-1;
           }
        }
        else
        {
           if(nums[mid]<target)
          {
            if(nums[n-1]<target)
                right=mid-1;
            else
                left=mid+1;
          }
          else
            right=mid-1;
        }
       }
       return -1;
    }
}