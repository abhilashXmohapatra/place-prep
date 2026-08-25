import java.util.Arrays;
class Solution {
    public int minMeetingRooms(int[] start, int[] end) {
        // code here
      Arrays.sort(start);
      Arrays.sort(end);
      int n=start.length;
      int i=0;
      int j=0;
      int res=0;
      int room=0;
      while(i<n &&j<n){
          if(start[i]<end[j]){
              i++;
             room++;
             res=Math.max(res,room);
          }
          else{
              room--;
              j++;
          }
      }
      return res;
    }
}
