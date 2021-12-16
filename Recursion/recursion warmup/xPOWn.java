import java.util.Scanner;
public class xPOWn {
    public static int xPOWn(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPOWnm1 = xPOWn(x, n-1);
        int ans = x*xPOWnm1;

        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int n = scn.nextInt();
        System.out.println(xPOWn(x, n));
    }
}
