package REVISION.RECURSION;

import java.util.Scanner;

public class printDecInc {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printDecInc(n);
    }

    public static void printDecInc(int n) {
        if(n==0){
            return;
        }
        System.out.println(n);
        printDecInc(n-1);
        System.out.println(n);
    }
}
