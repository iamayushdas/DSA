import java.util.Scanner;

public class mX1_Tiling {

    public static int ways(int n, int m){
        int[] dp = new int[n+1];
        for(int i = 1; i<=n; i++){
            if(i<m){
                dp[i] = 1;
            }else if(i == m){
                dp[i] = 2;
            }else {
                dp[i] = dp[i-1] + dp[i-m];
            }
        }
        return dp[n];
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int ans = ways(n, m);
        System.out.println(ans);
    }
}
