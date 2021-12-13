//                 *
//                 *       *
// *       *       *       *       *
//                 *       *
//                 *
import java.util.Scanner;
public class pattern17 {
    public static void pattern17(int n){
        int nst = 1, nsp = n/2;
        for(int r = 1; r<=n; r++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst = 1; cst<=nst; cst++){
                if(cst>nst/2 || r == n/2+1){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
            if(r<=n/2){
                nst+=2;
                nsp--;
            }else{
                nst-=2;
                nsp++;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern17(n);
    }
}
