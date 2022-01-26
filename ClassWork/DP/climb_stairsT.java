import java.util.Arrays;
import java.util.Scanner;

public class climb_stairsT {
    public static int climbStairsT(int N, int[] dp){
        for(int n = 0; n<dp.length; n++){
            if(n==0){
                dp[n] = 1;
                continue;
            }

            int count = 0;
            if(n-1 >= 0){
                count += dp[n-1];
            }
            if(n-2 >= 0){
                count += dp[n-2];
            }
            if(n-3 >= 0){
                count += dp[n-3];
            }
            
            dp[n] = count;
        }
        return dp[N];
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = climbStairsT(n, dp);
        System.out.println(ans);
    }
}
