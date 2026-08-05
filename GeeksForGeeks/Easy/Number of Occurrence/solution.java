class Solution {
    int countFreq(int[] arr, int target) {
        // code here
        int c=0;
        for(int a:arr){
            if(a==target)
            c++;
        }
        return c;
    }
}
