import java.util.HashMap;
class Solution 
{
    public String minWindow(String s, String t)
     {
         HashMap<Character,Integer> tMap=new HashMap<>();
        HashMap<Character,Integer> window=new HashMap<>();
        for(int i=0;i<t.length();i++){
            tMap.put(t.charAt(i),tMap.getOrDefault(t.charAt(i),0)+1);
        }
        int required=tMap.size();
        int minLen=Integer.MAX_VALUE;
        int start=0;
        int formed=0;
        int low=0;
        for(int high=0;high<s.length();high++)
        {
          char ch=s.charAt(high);
          window.put(ch,window.getOrDefault(ch,0)+1);
          if(tMap.containsKey(ch) && window.get(ch).intValue()==tMap.get(ch).intValue()){
            formed++;
          }
          while(required==formed){
            int len=(high-low) +1;
            if(len<minLen){
                minLen=len;
                start=low;
            }
            char c=s.charAt(low);
            window.put(c,window.get(c)-1);
            if(tMap.containsKey(c) && window.get(c).intValue()< tMap.get(c).intValue()){
                formed--;
            }
            low++;
          }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
    }
}