import java.util.Arrays;
import java.util.Scanner;

public class climb_stairsM {
    public static int climbStairsM(int n, int[] dp){
        if(n==0){
            return dp[n] = 1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        int count = 0;
        if(n-1 >= 0){
            count += climbStairsM(n-1, dp);
        }
        if(n-2 >= 0){
            count += climbStairsM(n-2, dp);
        }
        if(n-3 >= 0){
            count += climbStairsM(n-3, dp);
        }
        
        return dp[n] = count;
    }
    
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);
        int ans = climbStairsM(n, dp);
        System.out.println(ans);
    }
}
