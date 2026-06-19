class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        int low=0;
        int high=k-1;
        int sum=0;
        int res=0;
        int n=arr.length;
        for(int i=low;i<=high;i++){
            sum+=arr[i];
        }
        while(high<n){
            res=Math.max(res,sum);
            low++;
            high++;
            sum=sum-arr[low-1];
            if(high==n)
            break;
            sum=sum+arr[high];
        }
        return res;
    }
}