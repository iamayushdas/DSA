import java.util.Scanner;
public class pattern20{
    public static void pattern20(int n){
        for(int r = 1; r<=n ;r++){
            for(int st = 1; st<=n; st++){
                if(st == 1 || st == n ){
                    System.out.print("*\t");
                }else if(r>n/2 && (r == st || r+st == n+1)){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern20(n);
    }
}