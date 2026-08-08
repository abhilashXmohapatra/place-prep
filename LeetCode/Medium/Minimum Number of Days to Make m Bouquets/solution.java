import java.util.Arrays;
class Solution {
    boolean fun(int[] bloomDay,int m,int k,int minDay){
        int count=0;
        int cb=0;
        for(int i=0;i<bloomDay.length;i++){
            if(bloomDay[i]<=minDay){
                count++;
            }else{
              cb+=count/k;
              count=0;
            }
        }
        cb+=count/k;
        if (cb<m)
        return false;
        else 
        return true;
    }
    public int minDays(int[] bloomDay, int m, int k) {
       int n=bloomDay.length;
       if(n<m*k)
       return -1;
       int low=Integer.MAX_VALUE;
       int high=Integer.MIN_VALUE;
       for(int i:bloomDay){
        low=Math.min(low,i);
        high=Math.max(high,i);
       }
       int res=-1;
       while(low<=high){
        int minDay=(low+high)/2;
        if(fun(bloomDay,m,k,minDay)){
           res=minDay;
           high=minDay-1;
        }
        else{
            low=minDay+1;
        }
       } 
       return res;
    }
}