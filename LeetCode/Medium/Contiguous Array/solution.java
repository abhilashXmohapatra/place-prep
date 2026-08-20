import java.util.HashMap;
class Solution {
    public int findMaxLength(int[] nums) {
        HashMap<Integer,Integer> map =new HashMap<>();
       int one=0;
       int zero=0;
       int res=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==0)
        zero++;
        else
        one++;
        int dif=zero-one;
        if(dif==0)
            res=Math.max(res,i+1);
        
        if(!map.containsKey(dif))
        map.put(dif,i);
       else
        {
        int len=i-map.get(dif);
        res=Math.max(res,len);
        }
       }
       return res;
    }
}