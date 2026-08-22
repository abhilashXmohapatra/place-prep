import java.util.*;
class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
      List<int[]> li=new ArrayList<>();
      boolean insert=false;
      for(int i=0;i<intervals.length;i++){
        if(!insert && intervals[i][0]>=newInterval[0]){
        li.add(newInterval);
        insert=true;
        }
        li.add(new int[]{intervals[i][0],intervals[i][1]});
      } 
     if(!insert)
     li.add(newInterval);
      List<int[]> ans=new ArrayList<>();
      int start1=li.get(0)[0];
      int end1=li.get(0)[1];
      for(int i=1;i<li.size();i++){
        int start2=li.get(i)[0];
        int end2=li.get(i)[1];
        if(end1>=start2){
            start1=start1;
            end1=Math.max(end1,end2);
            continue;
        }
        ans.add(new int[]{start1,end1});
        start1=start2;
        end1=end2;
      }
      ans.add(new int[]{start1,end1});
      return ans.toArray(new int[ans.size()][]);
    }
}