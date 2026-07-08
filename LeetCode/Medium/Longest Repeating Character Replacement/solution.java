import java.util.HashMap;
class Solution {
    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> map=new HashMap<>();
      int n=s.length();
      int maxF=0;
      int res=Integer.MIN_VALUE;
      int low=0;
      for(int high=0;high<n;high++){
        char ch=s.charAt(high);
        map.put(ch,map.getOrDefault(ch,0)+1);
        maxF=Math.max(maxF,map.get(ch));
        int dif=((high-low)+1)-maxF;
        while(dif>k){
            char c=s.charAt(low);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0)
            map.remove(c);
            low++;
            dif=((high-low)+1)-maxF;
        }
        int len=(high-low)+1;
        res=Math.max(res,len);
      }
      return res;  
    }
}