import java.util.Scanner;
public class pattern11 {
    public static void pattern11(int n ){
        int count = 1, nst = 1;
        for(int r = 0; r<n; r++){
            for(int cst = 0; cst<nst; cst++){
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
            nst++;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern11(n);
    }
}
