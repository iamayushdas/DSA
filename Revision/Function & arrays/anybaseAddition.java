import java.util.Scanner;
public class anybaseAddition {
    public static int anybaseAdd(int b, int n1, int n2){
        int carry = 0, pow = 1, ans = 0;
        while(n1!=0 || n2!=0 || carry!=0){
            int d1 = n1%10;
            int d2 = n2%10;
            int sum = d1+d2+carry;

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
        System.out.println(anybaseAdd(b, n1, n2));
    }
}
