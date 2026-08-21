import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
      List<int[]> li=new ArrayList<>();
      Arrays.sort(intervals,(a,b)-> Integer.compare(a[0],b[0]));
      int start1=intervals[0][0];
      int end1=intervals[0][1];
      for(int i=1;i<intervals.length;i++){
        int start2=intervals[i][0];
        int end2=intervals[i][1];
        if(end1>=start2){
            start1=start1;
            end1=Math.max(end1,end2);
            continue;
        }
        li.add(new int[]{start1,end1});
        start1=start2;
        end1=end2;
      }  
      li.add(new int []{start1,end1});
      return li.toArray(new int[li.size()][]);
    }
}