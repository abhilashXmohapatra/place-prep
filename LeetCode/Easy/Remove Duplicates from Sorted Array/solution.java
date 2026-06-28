class Solution {
    public int removeDuplicates(int[] nums) {
      
      int u=1;
      int i=0;
      for(int j=1;j<nums.length;j++){
        if(nums[j]!=nums[j-1]){
            u++;
            nums[i+1]=nums[j];
            i++;
        }
      }
      
      return u;
    }
}
