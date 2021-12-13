import java.util.Scanner;
public class pattern13 {
    public static void pattern13(int t){
        int nst = 1 , nFac = 1;
        for(int n=0; n<t; n++){
            int nCr = 1;
            for(int r = 0; r<nst; r++){
                // System.out.print(n + "C" +r + "\t");
                System.out.print(nCr + "\t");
                int nCrp1 = nCr*(n-r)/(r+1);
                nCr = nCrp1;
            }
            System.out.println();
            nst++;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern13(n);
    }
}
