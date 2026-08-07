class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int n=arr.length;
        int low=0;
        int high=n-1;
        int end=-1;
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(arr[mid]>arr[n-1]){
              end=mid;
              low=mid+1;
            }
            else
            high=mid-1;
        }
        int k=end+1;
        return k;
    }
}