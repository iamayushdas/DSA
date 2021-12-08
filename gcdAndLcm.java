import java.util.Scanner;
public class gcdAndLcm {

    public static int gcd(int n1, int n2){
        int i = 0;
        for(i = n1; i>=1; i--){
            if((n1%i == 0) && (n2%i==0)){
                break;
            }
        }
        return i;
    }

    public static void lcm(int n1, int n2){
        int lcm = (n1*n2)/gcd(n1, n2);
        System.out.println("LCM: "+ lcm);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        int gcd = gcd(n1, n2);
        System.out.println("GCD: " + gcd);
        lcm(n1, n2);
    }
}
