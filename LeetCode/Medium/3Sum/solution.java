import java.util.ArrayList;
import java.util.Arrays;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       List<List<Integer>> li = new ArrayList<>();
       Arrays.sort(nums);
       int n=nums.length;
      for (int i=0;i<n-2;i++){
        if (i>0 && nums[i]==nums[i-1]){
            continue;
        }
          int sum=-1*nums[i];
          int left=i+1;
          int right=n-1;
          while(left<right){
            int s=nums[left]+nums[right];
            if(s==sum){
                li.add(Arrays.asList(nums[i],nums[left],nums[right]));
                left++;
                right--;
                while(left < n && nums[left]==nums[left-1]){
                    left++;
                }
                while(right>= 0 && nums[right]==nums[right+1]){
                    right--;
                }
            }
            else if (s<sum){
                left++;
            }
            else{
                right--;
            }
          }
      }
      return li;
    }
}