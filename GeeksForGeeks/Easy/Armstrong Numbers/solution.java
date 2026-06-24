class Solution {
    static boolean armstrongNumber(int n) {
        // code here
        int s=0;
        int t=n;
        while(t>0){
          int ld=t%10;
          s+=ld*ld*ld;
          t=t/10;
        }
        if(s==n){
            return true;
        }{
            return false;
        }
    }
}