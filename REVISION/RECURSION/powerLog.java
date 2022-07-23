package REVISION.RECURSION;

import java.util.Scanner;

public class powerLog {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(powerLog(x, n));
    }

    public static int powerLog(int x, int n){
        if(n == 0) return 1;

        int xpnb2 = powerLog(x, n/2);

        int xpn = xpnb2*xpnb2;

        if(n%2 == 1){
            xpn *= x;
        }

        return xpn;
    }
}
