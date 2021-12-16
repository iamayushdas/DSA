import java.util.Scanner;
public class xPOWnlog {
    public static int xPOWnlog(int x , int n){
        if(n==0) return 1;
        if(x==0) return 0;

        if(n%2 == 0) return xPOWnlog(x, n/2)* xPOWnlog(x, n/2);
        return xPOWnlog(x, n/2)*xPOWnlog(x, n/2) * x;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(xPOWnlog(x, n));
    }
}
