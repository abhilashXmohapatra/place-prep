class Solution {
    boolean fun(int[] weights,int days,int cap){
        int c=0;
        int d=1;
        for(int i=0;i<weights.length;i++){
            if(weights[i]+c<=cap){
                c+=weights[i];
            }
            else{
                d++;
                c=weights[i];
            }
            if(d>days)
            return false;
        }
        return true;
    }
    public int shipWithinDays(int[] weights, int days) {
        int n=weights.length;
        int low=0;
        int high=0;
        int res=-1;
        for(int i:weights){
          low=Math.max(low,i);
         high+=i;
        }
        while(low<=high){
            int cap=(low+high)/2;
            if(fun(weights,days,cap)){
                res=cap;
                high=cap-1;
            }
            else{
                low=cap+1;
            }
        }
       
    return res;
    } 
}