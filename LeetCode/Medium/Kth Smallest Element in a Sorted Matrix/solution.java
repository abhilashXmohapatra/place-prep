class Solution {
    int fun(int[][] matrix,int mid,int m,int n)
    {
        int row=m-1;
        int col=0;
        int count=0;
        while(row>=0 && col<n)
        {
            if(matrix[row][col]>mid)
              row--;
            else {
                count+=row+1;
                col++;
            }
        }
        return count;
    }
    public int kthSmallest(int[][] matrix, int k) {
     int m=matrix.length;
     int n=matrix[0].length;
     int low=matrix[0][0];
     int high=matrix[m-1][n-1];
     int res=-1;
     while(low<=high)
     {
        int mid=(low+high)/2;
        int ans=fun(matrix,mid,m,n);
        if(ans<k){
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