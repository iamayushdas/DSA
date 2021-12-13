import java.util.Scanner;
public class decimalToBinary {
    public static int decimalToBinary(int n){
        int ans = 0, pow = 1;
        while(n>0){
            int d = n%2;
            n/=2;
            ans+=d*pow;
            pow*=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(decimalToBinary(n));
    }
}
