import java.util.HashMap;
class Solution {
    public int longestKSubstr(String s, int k) {
        HashMap<Character,Integer> map =new HashMap<>();
       int low=0;
       int res=Integer.MIN_VALUE;
       for (int high=0;high<s.length();high++){
          map.put(s.charAt(high),map.getOrDefault(s.charAt(high),0)+1);
          while(map.size()>k){
              char lChar=s.charAt(low);
              map.put(lChar,map.get(lChar)-1);
              if(map.get(lChar)==0){
                  map.remove(lChar);
              }
              low++;
          }
          if(map.size()==k){
              int len=high-low+1;
              res=Math.max(res,len);
          }
       }
       return res == Integer.MIN_VALUE ?-1 :res;
    }
}