class Solution {
    boolean fun(int[] candies,int mid,long k){
        long gc=0;
        for(int i=0;i<candies.length;i++){
            gc+=candies[i]/mid;
            if(gc>=k)
            return true;
        }
        return false;
    }
    public int maximumCandies(int[] candies, long k) {
     int n=candies.length;
     int low=1;
     int high=0;
     int res=0;
     for(int i:candies){
        high=Math.max(high,i);
     }
     while(low<=high){
        int mid=(low+high)/2;
        if(fun(candies,mid,k)){
            res=mid;
            low=mid+1;
        }else{
            high=mid-1;
        }
     }
     return res;
    }
}