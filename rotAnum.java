import java.util.Scanner;
public class rotAnum {
    public static Scanner scn = new Scanner(System.in);
    public static int count(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }
    public static void rotAnum(int n , int k){
        k= (k%count(n) + count(n)) % count(n);
        int pow = (int)Math.pow(10, k);
        int p = (n%pow)*(int)Math.pow(10, count(n) - k ) ;
        int q = n/pow;
        int sum = p + q ;
        System.out.println(sum);

    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int k = scn.nextInt();
        rotAnum(n, k);
    }
}
