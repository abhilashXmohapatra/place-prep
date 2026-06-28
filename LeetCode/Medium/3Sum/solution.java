import java.util.*;
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        List<List<Integer>> list=new ArrayList<>();
        for(int i=0;i<n-2;i++){
           int target=-1*nums[i];
           int l=i+1;
           int r=n-1;
           if(i>0 && nums[i]==nums[i-1])
             continue;
           while(l<r){
             int sum=nums[l]+nums[r];
             if(sum==target){
                list.add(Arrays.asList(nums[i],nums[l],nums[r]));
                l++;
                r--;
                while(l<r && nums[l]==nums[l-1]){
                    l++;
                }
                while(l<r  && nums[r]==nums[r+1]){
                    r--;
                }

             }
             else if(sum<target){
                l++;
             }
             else{
                r--;
             }
           }
        }
        return list;
    }
}
