import java.util.Scanner;
public class inverseNum {
    public static int inverseRtoL(int num){
        int index = 1, r2l = 0;
        while(num>0){
            int d = num%10;
            num/=10;
            r2l+=index*(int)Math.pow(10, d-1);
            index++;
        }
        return r2l;
    }

    public static int count(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int inverseLtoR(int n){
        int l2r = 0, index = count(n), p = count(n);
        while(n>0){
            int d = n%10;
            l2r+=index*(int)Math.pow(10, (p - d));
            n/=10;
            index--;
        }
        return l2r;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println("Right to left inverse " + inverseRtoL(n));
        System.out.println("Left to right inverse " + inverseLtoR(n));
    }
}
