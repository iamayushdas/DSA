import java.util.Scanner;
public class factorial {
    public static int factorial(int n){
        return (n==0)? 1 : n*(factorial(n-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(factorial(n));
    }
}
