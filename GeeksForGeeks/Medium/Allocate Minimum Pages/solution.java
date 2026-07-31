class Solution {
    boolean fun(int[] arr,int k,long limit){
        int n=arr.length;
        int s=1;
        long page=0;
        for(int i=0;i<n;i++){
            if(page+arr[i]<=limit){
                 page=page+arr[i];
            }
            else{
                s++;
                page=arr[i];
            }
            if(s>k){
            return false;
           }
        }
        return true;
        
    }
    public int findPages(int[] arr, int k) {
        // code here
        int n=arr.length;
        if(n<k)
        return -1;
        long low=arr[0];
        long high=0;
        for(int i=0;i<n;i++){
            low=Math.max(low,arr[i]);
            high=high+arr[i];
        }
        long res=-1;
        while(low<=high){
            long limit=(low+high)/2;
            if(fun(arr,k,limit)){
                res=limit;
                high=limit-1;
            }
            else{
                low=limit+1;
            }
        }
        return (int)res;
    }
}