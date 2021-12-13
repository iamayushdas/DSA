import java.util.Scanner;
public class pattern19{
    public static void pattern19(int n){
        int nst = n;
        for(int r=1; r<=n; r++){
            for(int cst = 1; cst<=nst; cst++){
                if((cst>nst/2+1 && cst<nst && r<=n/2) || (r>1 && r<=n/2 && cst<nst/2+1) || (r>n/2+1 && cst>1 && cst<nst/2+1) || (r>n/2+1 && r<n && cst>nst/2+1)){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern19(n);
    }
}