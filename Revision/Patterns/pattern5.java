//                 *
//         *       *       *
// *       *       *       *       *
//         *       *       *
//                 *
import java.util.Scanner;
public class pattern5 {
    public static void pattern5(int n){
        int nst = 1, nsp = n/2;
        for(int r = 1; r<=n; r++){
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            for(int cst = 1; cst<=nst; cst++){
                System.out.print("*\t");
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
        pattern5(n);
    }
}
