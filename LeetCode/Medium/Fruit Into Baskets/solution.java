import java.util.HashMap;
class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer,Integer> map=new HashMap();
       int n=fruits.length;
       int res=Integer.MIN_VALUE;
       int low=0;
       for(int high=0;high<n;high++){
          map.put(fruits[high],map.getOrDefault(fruits[high],0)+1);
          while(map.size()>2){
            int x=fruits[low];
            map.put(x,map.get(x)-1);
            if(map.get(x)==0)
             map.remove(x);
            low++;
          }
          if(map.size()<=2){
         int len=(high-low)+1;
          res=Math.max(res,len);
          }
          
       } 
       return res;
    }
}