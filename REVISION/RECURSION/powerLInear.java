package REVISION.RECURSION;

import java.util.Scanner;

public class powerLInear {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerLinear(x,n));
    }

    public static int powerLinear(int x , int n){
        if(n==0){
            return 1; 
        }
        return powerLinear(x, n-1)*x;
    }
}
