class Solution {
    static int smallestSumSubarray(int a[], int size) {
        // your code here
        int end=a[0];
        int ans=a[0];
        for(int i=1;i<size;i++)
        {
            int v1=end+a[i];
            int v2=a[i];
            end=Math.min(v1,v2);
            ans=Math.min(ans,end);
        }
        return ans;
    }
}