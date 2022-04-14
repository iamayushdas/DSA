import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a,b)-> {
            return a[0] - b[0];
        });
        Stack<int []> st = new Stack<>();
        st.push(intervals[0]);
        
        for(int i = 0; i<intervals.length; i++){
            int[] t = st.pop();
            int s1 = t[0];
            int e1 = t[1];
            
            int s2 = intervals[i][0];
            int e2 = intervals[i][1];
            
            int emax = Math.max(e1, e2);
            
//             merge condition
            if(s2<=e1){
                int [] merge = {s1, emax};
                st.push(merge);
            }else{
                st.push(t);
                st.push(intervals[i]);
            }
        }
        
        
        int [][] ans = new int[st.size()][2];
        
        for(int i = ans.length-1; i>=0; i--){
            int[] tmp = st.pop();
            ans[i][0] = tmp[0];
            ans[i][1] = tmp[1];    
        }
        
        return ans;
    }
}
