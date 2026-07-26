class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int i=0;
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int mid=(left+right)/2;
            if(arr[mid]>arr[mid+1]){
                i=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return i;
    }
}