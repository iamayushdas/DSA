// 1                                                               1
// 1       2                                               2       1
// 1       2       3                               3       2       1
// 1       2       3       4               4       3       2       1
// 1       2       3       4       5       4       3       2       1
import java.util.Scanner;
public class pattern16 {
    public static void pattern16(int n){
        int nst = 1, nsp = 2*n-3;
        for(int r = 0; r<n; r++){
            int count = 1;
            for(int cst = 1; cst<=nst; cst++){
                System.out.print(count+ "\t");
                count++;
            }
            for(int csp = 1; csp<=nsp; csp++){
                System.out.print("\t");
            }
            if(r==n-1){
                nst--;
                count--;
            }
            for(int cst = 1; cst<=nst; cst++){
                count--;
                System.out.print(count+"\t");
            }
            System.out.println();
            nst++;
            nsp-=2;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern16(n);
    }
}
