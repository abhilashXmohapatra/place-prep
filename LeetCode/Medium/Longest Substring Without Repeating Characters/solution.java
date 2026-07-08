import java.util.HashMap;
class Solution {
    public int lengthOfLongestSubstring(String s) {
       HashMap<Character,Integer> map =new HashMap<>();
       int n=s.length();
       int res=0;
       int low=0;
       for(int high=0;high<n;high++){
        char ch=s.charAt(high);
        map.put(ch,map.getOrDefault(ch,0)+1);
        int k=(high-low)+1;
        while(map.size()<k){
            char c=s.charAt(low);
            map.put(c,map.get(c)-1);
            if(map.get(c)==0){
                map.remove(c);
            }
            low++;
            k=(high-low)+1;
        }
        int len=(high-low)+1;
        res=Math.max(res,len);
       }
       return res;
    }
}