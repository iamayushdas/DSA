// *       *       *               *       *       *
// *       *                               *       *
// *                                               *
// *       *                               *       *
// *       *       *               *       *       *
import java.util.Scanner;
public class pattern6 {
    public static void pattern6(int n){
        int nst = (n/2)+1 , nsp = 1;
        for(int r = 1; r<=n; r++){
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*\t");
            }
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*\t");
            }

            System.out.println();
            if(r<=n/2){
                nst--;
                nsp+=2;
            }else{
                nst++;
                nsp-=2;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern6(n);
    }
}
