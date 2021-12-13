// 0
// 1       1
// 2       3       5
// 8       13      21      34
// 55      89      144     233     377
import java.util.Scanner;
public class pattern12 {
    public static void pattern12(int n){
        int nst = 1 , a = 0, b = 1;
        for(int r = 0; r<n; r++){
            for(int cst = 1; cst<=nst; cst++){
                System.out.print(a + "\t");
                int c = a+b;
                a = b;
                b = c;
            }
            System.err.println();
            nst++;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern12(n);
    }
}
