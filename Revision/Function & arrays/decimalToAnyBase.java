import java.util.Scanner;
public class decimalToAnyBase {
    public static int decimalToAnyBase(int n , int b){
        int ans = 0, pow = 1;
        while(n>0){
            int d = n%b;
            n/=b;

            ans+=d*pow;
            pow*=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(decimalToAnyBase(n, b));
    }
}
