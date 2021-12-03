import java.util.Scanner;

public class funcOps {
    public static int decimalAddition(int n, int m ){
        int ans = 0, carry = 0, pow = 1;
        while(n!=0 || m!=0 || carry!=0){
            int sum = carry + (n!=0?n%10:0) + (m!=0?m%10:0);
            n/=10;
            m/=10;
            carry = sum/10;
            sum = sum%10;
            ans += sum * pow;
            pow = pow * 10;
        }
        return ans;
    }

    public static int anyBaseAddition(int b, int n, int m){
        int ans = 0, carry = 0, pow = 1;
        while(n!=0 || m!=0 || carry != 0){
            int sum = carry + n%b + m%b;
            n/=10;
            m/=10;
            carry = sum/b;
            sum = sum%b;
            
            ans += sum*pow;
            pow = pow*10;
        }
        return ans;
    }

    public static int decimalSubtraction(int n , int m){
        int ans = 0, borrow = 0, pow = 1;
        while(n!=0 || m!=0 || borrow!=0){
            int d1 = n%10;
            int d2 = m%10;
            int sub = (borrow + d1) - d2;
            n/=10;
            m/=10;
            if(sub<0){
                borrow = -1;
                sub += 10;
            }else{
                borrow = 0;
            }
            ans+=sub*pow;
            pow*=10;
        }
        return ans;
    }

    public static int anyBaseSubtraction(int b, int n , int m){
        int ans = 0, borrow = 0, pow = 1;
        while(n!=0 || m!=0 || borrow!=0){
            int d1 = n%10;
            int d2 = m%10;
            n/=10;
            m/=10;
            int sub = d1 + borrow - d2;
            if(sub < 0){
                borrow = -1;
                sub +=b ;
            }else{
                borrow = 0;
            }
            ans+=sub*pow;
            pow*=10;
        }
        return ans;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.println(anyBaseSubtraction(b, n, m));
    }
}
