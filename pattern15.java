//                 1
//         2       3       2
// 3       4       5       4       3
//         2       3       2
//                 1
import java.util.Scanner;
public class pattern15 {
    public static void pattern15(int n){
        int nsp = n/2, nst = 1, count = 1;
        for(int r = 0; r<n; r++){
            for(int csp = 1; csp <= nsp; csp++){
                System.out.print("\t");
            }
            int val = count;
            for(int cst = 1; cst<=nst; cst++){
                System.out.print(val + "\t");
                if(cst<=nst/2){
                    val++;
                }else{
                    val--;
                }
            }
            System.out.println();
            if(r<n/2){
                nst+=2;
                nsp--;
                count++;
            }else{
                nst-=2;
                nsp++;
                count--;
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern15(n);
    }
}
