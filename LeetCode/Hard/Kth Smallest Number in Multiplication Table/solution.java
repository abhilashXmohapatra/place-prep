class Solution {
    int fun(int mid,int m,int n){
        int row=m;
        int col=1;
        int count=0;
        while(row>=1 && col<=n){
            if(row*col>mid)
            row--;
            else{

            count=count+row;
            col++;
            }

        }
        return count;
    }
    public int findKthNumber(int m, int n, int k) {
       int low=1;
       int high=m*n;
       int res=-1;
       while(low<=high)
       {
        int mid=(low+high)/2;
        if(fun(mid,m,n)<k){
            low=mid+1;
        }
        else{
          res=mid;
          high=mid-1;
        }
       } 
       return res;
    }
}