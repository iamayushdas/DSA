package Recursion;
import java.util.Scanner;
public class powerLogarithmic {
    public static int powerLogarithmic(int n , int p){
        if(p==0){
            return 1;
        }
        int recAns = powerLogarithmic(n, p/2);
        int myAns = recAns * recAns;
        if(p%2 != 0){
            myAns*=n;
        }
        return myAns;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int p = scn.nextInt();
        System.out.println(powerLogarithmic(n, p));
    }
}
