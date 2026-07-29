class Solution {
    long fun(int[] piles,int k){
        long t=0;
        for(int i=0;i<piles.length;i++){
            t=t+(piles[i]/k);
            if(piles[i]%k!=0){
                t++;
            }
        }
        return t;
    }
    public int minEatingSpeed(int[] piles, int h) {
        int max=piles[0];
        for(int i=1;i<piles.length;i++){
            max=Math.max(max,piles[i]);
        }
        int low=1;
        int high=max;
        int res=-1;
        while(low<=high){
            int k=(low+high)/2;
            long time=fun(piles,k);
            if(time>h){
                low=k+1;
            }
            else{
              res=k;
              high=k-1;
            }
        }
        return res;
    }
}