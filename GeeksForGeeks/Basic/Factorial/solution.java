class Solution {
    int factorial(int n) {
        // code here
        int f=1;
        while(n>0){
            f=f*n;
            n--;
        }
        return f;
    }
}
