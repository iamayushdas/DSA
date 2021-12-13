import java.util.Scanner;
public class anyBaseToAnyBase {
    public static int anyBaseToDecimal(int n, int b){
        int ab2d = 0, pow = 1;
        while(n>0){
            int d = n%10;
            n/=10;

            ab2d+=d*pow;
            pow*=b;
        }
        return ab2d;
    }

    public static int decimalToAnyBase(int n, int b){
        int d2ab = 0, pow = 1;
        while(n>0){
            int d = n%b;
            n/=b;

            d2ab+=d*pow;
            pow*=10;
        }
        return d2ab;
    }
    public static void anyBaseToAnyBase(int n, int b1, int b2){
        int ab2d = anyBaseToDecimal(n, b1);
        int d2ab = decimalToAnyBase(ab2d, b2);
        System.out.println(d2ab);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int b1= scn.nextInt();
        int b2 = scn.nextInt();
        anyBaseToAnyBase(n, b1, b2);
    }
}
