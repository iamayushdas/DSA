package Recursion;
import java.util.Scanner;
public class powerLinear {
    public static int powerLinear(int n, int p){
        return(p==0?1:n*powerLinear(n, p-1));
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        int fn = powerLinear(n, p);
        System.out.println(fn);
    }
}
