import java.util.Scanner;
public class funcOps {
    public static int decimalToBinary(int n){
        int ans = 0, pow = 1;
        while(n!=0){
            int rem = n%2;
            n/=2;
            ans+=rem*pow;
            pow=pow*10;
        }
        return ans;
    }
    public static int binaryToDecimal(int n){
        int ans = 0, pow = 1;
        while(n!=0){
            int rem = n%10;
            n/=10;
            ans+=rem*pow;
            pow=pow*2;
        }
        return ans;
    }

    public static int decimalToAnyBase(int n , int b){
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n%b;
            n/=b;
            ans+=rem*pow;
            pow*=10;
        }
        return ans;
    }

    public static int anyBaseToDecimal(int n , int b){
        int ans = 0, pow = 1;
        while(n != 0){
            int rem = n%10;
            n/=10;
            ans+=rem*pow;
            pow*=b;
        }
        return ans;
    }

    public static int anyBaseToAnyBase(int n , int b1, int b2){
       int ab2d = anyBaseToDecimal(n, b1);
       int d2ab = decimalToAnyBase(ab2d, b2);

       return d2ab;
    }

    public static void printTable(int n){
        for(int i = 1; i<=10; i++){
            System.out.println(n + " X " + i + " = " + i*n  );
        }
    }

    public static int anyBaseAddition(int b, int n , int m){
        int ans = 0, carry = 0 , pow = 1;
        while(n!=0 || m!=0 || carry != 0){
            int sum = carry + n%10 + m%10;
            n/=10;
            m/=10;

            carry = sum/b;
            sum%=b;

            ans+=sum*pow;
            pow*=10;

        }
        return ans;
    }

    public static int multiplyDigitWithAnumber(int n, int digit, int base){
        int ans = 0 , carry = 0, pow = 1;
        while(n!=0 || carry!=0){
            int product = carry + (n%10) * digit;
            n/=10;

            carry = product/base;
            product%=base;

            ans+=product*pow;
            pow*=10;
        }


        return ans;
    }
    public static int getProduct(int b, int n, int m){
        int ans = 0, pow = 1;
        while(m!=0){
            int digitMultiply = multiplyDigitWithAnumber(n, m%10, b);
            m/=10;

            ans = anyBaseAddition(b, ans, digitMultiply * pow);
            pow *= 10;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt(); 
        int n = scn.nextInt();
        int m = scn.nextInt();
        System.out.print(getProduct(b, n, m));
    }
}
