import java.util.Scanner;
public class pattern10 {

    public static void pattern10(int n){
        int nst = 1, nsp1= n/2 , nsp2 = -1;
        for(int r=0; r<n; r++){
            for(int csp1 = 1; csp1<=nsp1; csp1++){
                System.out.print("\t");
            }
            for(int cst = 0; cst<nst; cst++){
                System.out.print("*\t");
            }
            for(int csp2 = 0; csp2<nsp2; csp2++){
                System.out.print("\t");
            }
            if(r>0 && r<n-1){
                System.out.print("*\t");
            }

            if(r<n/2){
                nsp1--;
                nsp2+=2;
            }else{
                nsp1++;
                nsp2-=2;
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern10(n);
    }
}
