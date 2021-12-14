import java.util.Scanner;
public class decimalAddition {
    public static int decimalAdd(int n1, int n2){
        int carry = 0, ans = 0, pow = 1;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1 = n1%10;
            int d2 = n2%10;
            int sum = d1 + d2 + carry;

            n1/=10;
            n2/=10;
            carry = sum/10;
            sum%=10;

            ans+=sum*pow;
            pow*=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(decimalAdd(n1, n2));

    }
}
