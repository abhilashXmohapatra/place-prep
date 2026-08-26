import java.util.*;
class Solution {
    public ArrayList<Integer> prefSum(int[] arr) {
       ArrayList<Integer> li =new ArrayList<>();
       int sum=0;
       for(int i=0;i<arr.length;i++){
           sum+=arr[i];
           li.add(sum);
       }
       return li;
    }
}