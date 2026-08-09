class Solution {
   
    public int hIndex(int[] citations) {
       int low=0;
       int n=citations.length;
       int high= n-1;
       int res=0;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(citations[mid]>=n-mid)
        {
          res=n-mid;
          high=mid-1;
        }
        else
         low=mid+1;
       }
    return res;
    }
}