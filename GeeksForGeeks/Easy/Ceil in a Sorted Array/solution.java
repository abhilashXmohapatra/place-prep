class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int left=0;
        int right=arr.length-1;
        int res=-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>=x){
                 res=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return res;
    }
}
