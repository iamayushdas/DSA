    // *       *       *       *       *
    //         *       *       *       *
    //                 *       *       *
    //                         *       *
    //                                 *
import java.util.Scanner;
public class pattern4 {
    public static void pattern4(int n){
        int nst = n , nsp = 0;
        for(int r = 0; r<n; r++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*\t");
            }
            System.out.println();

            nsp++;
            nst--;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern4(n);
    }
}
