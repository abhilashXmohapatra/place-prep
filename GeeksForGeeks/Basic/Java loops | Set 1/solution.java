import java.util.ArrayList;
class Solution {
    static ArrayList<Integer> getSum(int N) {
        // code here
       ArrayList<Integer> li=new ArrayList<>();
       int e=0;
       int o=0;
       for(int i=0;i<=N;i++){
           if(i%2==0)
           e+=i;
           else
           o+=i;
       }
       li.add(e);
       li.add(o);
       return li;
    }
}