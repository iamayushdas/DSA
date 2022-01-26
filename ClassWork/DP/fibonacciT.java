import java.util.Arrays;
import java.util.Scanner;

public class fibonacciT {
    public static void display(int[] dp){
        for(int e : dp){
            System.out.print(e + " ");
        }
        System.out.println();
    }


    //                                          Tabular method
    public static int fiboT(int N, int[] dp){
        for(int n = 0; n<dp.length; n++){
            if(n<=1){
               dp[n] = n;
               continue;
            }

            int nm1 = dp[n-1];
            int nm2 = dp[n-2];

            dp[n] = nm1 + nm2;
            continue;

        }
        return dp[N];

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        int ans = fiboT(n, dp);
        display(dp);
        System.out.println(ans);

    }
}
