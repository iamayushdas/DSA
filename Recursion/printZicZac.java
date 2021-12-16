import java.util.Scanner;
public class printZicZac {
    public static void func(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        func(n-1);
        System.out.println(n);
        func(n-1);
        System.out.println(n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        func(n);
    }
}
