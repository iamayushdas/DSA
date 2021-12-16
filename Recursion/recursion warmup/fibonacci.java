import java.util.Scanner;
public class fibonacci {
    public static void fibonacci(int a, int b, int n){
        if(n==0) return;
        int c = a+b;
        System.out.println(c);
        fibonacci(b, c, n-1);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
         System.out.println(a);
         System.out.println(b);
         fibonacci(a, b, n-2);
    }
}
