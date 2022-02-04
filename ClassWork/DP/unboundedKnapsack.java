import java.util.Scanner;

public class unboundedKnapsack {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] value = new int[n];

        for(int i = 0;i<value.length; i++){
            value[i] = scn.nextInt();
        }

        int[] wt = new int[n];
        for(int i = 0;i<wt.length; i++){
            wt[i] = scn.nextInt();
        }

        int cap = scn.nextInt();

        int[] dp = new int[cap+1];
        dp[0] = 0;

        for(int bag = 1; bag<=cap; bag++){
            int max = 0;
            for(int i = 0; i<wt.length ; i++){
                if(wt[i] <= bag){
                    int remaining = bag - wt[i];
                    int remOptimalVal = dp[remaining];
                    int myOptimalVal = value[i] + remOptimalVal;

                    if(myOptimalVal > max){
                        max = myOptimalVal;
                    }
                }
            }
            dp[bag] = max;
        }

        System.out.println(dp[cap]);
    }
}
