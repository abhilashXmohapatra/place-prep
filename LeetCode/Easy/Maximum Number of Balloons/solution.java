import java.util.HashMap;
class Solution {
    public int maxNumberOfBalloons(String text) {
      HashMap<Character,Integer> have =new HashMap<>();
      HashMap<Character,Integer> need=new HashMap<>();
      need.put('b',1);
      need.put('a',1);
      need.put('l',2);
      need.put('o',2);
      need.put('n',1);
      for(char ch:text.toCharArray()){
        have.put(ch,have.getOrDefault(ch,0)+1);
      } 
      int res=Integer.MAX_VALUE;
      for(char ch: need.keySet()){
        int avail=have.getOrDefault(ch,0);
        int req=need.get(ch);
        int times=avail/req;
        res=Math.min(res,times);
      }
      return res;
    }
}