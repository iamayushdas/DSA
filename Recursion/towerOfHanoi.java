import java.util.Scanner;
public class towerOfHanoi {
    public static void toh(int n, int A, int B, int C){
        if(n==0) return;
        toh(n-1, A, C, B);
        System.out.println(n +"[" + A + "->" + B + "]");
        toh(n-1, C, B, A);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int A = scn.nextInt();
        int B = scn.nextInt();
        int C = scn.nextInt();
        toh(n, A, B, C);
    }
}
