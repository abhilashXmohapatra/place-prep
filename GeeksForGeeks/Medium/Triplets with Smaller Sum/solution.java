import java.util.Arrays;
class Solution {
    int countTriplets(int sum, int arr[]) {
        Arrays.sort(arr);
        int count=0;
        int n=arr.length;
        for (int i=0;i<n-2;i++)
        {
            int left=i+1;
            int right=n-1;
            while(left<right){
                int s=arr[i]+arr[left]+arr[right];
                if(s>=sum){
                    right--;
                }
                else{
                    count=count+(right-left);
                    left++;
                }
            }
        }
        return count;
    }
}