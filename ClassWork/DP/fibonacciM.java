public class fibonacciM {
    
}

import java.util.Arrays;
import java.util.Scanner;

public class fibonacci {
    public static void display(int[] dp){
        for(int e : dp){
            System.out.print(e + " ");
        }
        System.out.println();
    }
//                                           Memoization method
    public static int fiboR(int n, int[] dp){
        if(n<=1){
            return dp[n] = n;
        }

        if(dp[n] != -1){
            return dp[n];
        }

        int nm1 = fiboR(n-1, dp);
        int nm2 = fiboR(n-2, dp);

        return dp[n] = nm1 + nm2;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        int n = scn.nextInt();
        int[] dp = new int[n+1];
        Arrays.fill(dp, -1);

        int ans = fiboR(n, dp);
        display(dp);

        System.out.println(ans);
    }
}

