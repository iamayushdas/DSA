import java.util.Scanner;
public class anyBaseToDecimal {
    public static int anyBaseToDecimal(int n, int b){
        int ans = 0, pow = 1;
        while(n>0){
            int d = n%10;
            n/=10;

            ans+=d*pow;
            pow*=b;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        System.out.println(anyBaseToDecimal(n, b));
    }
}
