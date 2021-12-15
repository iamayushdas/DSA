import java.util.Scanner;
public class anyBaseMultiplication {
    public static int product(int b, int n1, int n2){
        int ans = 0, pow = 1;
        while(n2!=0){
            int d2 = n2%10;
            n2/=10;

            int allDigitMultiplication = singleDigitMultiplication(b, n1, d2);
            ans = getSum(b, ans , allDigitMultiplication*pow);
            pow*=10;

        }
        return ans;
    }
    public static int singleDigitMultiplication(int b, int n1 , int d2){
        int carry = 0, ans = 0, pow = 1;
        while(n1!=0 || carry!=0){
            int d1 = n1%10;
            n1/=10;

            int mul = carry + (d1 * d2);
            carry = mul/b;
            mul%=b;

            ans+=mul*pow;
            pow*=10;
        }
        return ans;
    }

    public static int getSum(int b, int n1, int n2){
        int carry = 0, ans = 0, pow = 1;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1 = n1%10;
            int d2 = n2%10;
            int sum = d1 + d2 + carry;

            n1/=10;
            n2/=10;

            carry = sum/b;
            sum%=b;

            ans+=sum*pow;
            pow*=10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(product(b, n1, n2));
    }
}
