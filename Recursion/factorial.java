package Recursion;
import java.util.Scanner;
public class factorial {
    public static int factorial(int n){
        // if(n==0)return 1;

        // Method 1

        // int fnm1 = factorial(n - 1);
        // int fn = n*fnm1;
        // return fn;

        // Method 2
        // return n*factorial(n-1);

        // Method 3
        return(n==0?1:n*factorial(n-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int fn = factorial(n);
        System.out.println(fn);
    }
}
