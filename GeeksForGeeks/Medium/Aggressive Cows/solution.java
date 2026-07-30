import java.util.Arrays;
class Solution {
     boolean fun(int[] arr, int guess ,int k)
        {
            int placedcows=1;
            int prePos=arr[0];
            for(int i=1;i<arr.length;i++){
                int dist=arr[i]-prePos;
                if(dist<guess)
                continue;
                placedcows++;
                prePos=arr[i];
            }
            if(placedcows<k)
            return false;
            else
            return true;
        }
    public int aggressiveCows(int[] arr, int k) {
        // code here
        Arrays.sort(arr);
        int n=arr.length;
        int low=1;
        int high=arr[n-1]-arr[0];
        int res=-1;
        while(low<=high){
            int guess=(low+high)/2;
            if(fun(arr,guess,k)){
                res=guess;
                low=guess+1;
            }
            else{
                high=guess-1;
            }
        }
        return res;
    }
}