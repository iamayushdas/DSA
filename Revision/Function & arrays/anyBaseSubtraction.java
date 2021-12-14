import java.util.Scanner;
public class anyBaseSubtraction {
    public static int anyBaseSubtraction(int b, int n1, int n2){
        int borrow = 0, ans = 0, pow = 1;
        while(n1!=0 || n2!=0 || borrow!=0){
            int d1 = n1%10;
            int d2 = n2%10;

            int sub = (d2+borrow) - d1;
            n1/=10;
            n2/=10;

            if(sub<0){
                borrow = -1;
                sub+=b;
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
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        System.out.println(anyBaseSubtraction(b, n1, n2));

    }
}
