import java.util.Scanner;
public class digitsOfNum {

    public static int countDigit(int num){
        int count = 0;
         while(num>0){
             num/=10;
             count++;
         }
         return count;
     }

    public static void digitsOfNum(int n){
        int div = (int)Math.pow(10, countDigit(n) - 1);
        while(div > 0){
            int d = n/div;
            n%=div;
            div/=10;
            System.out.println(d);
        }
    }

    // public static int reverse(int n){
    //     int d = 0, sum = 0, pow = countDigit(n) - 1;
    //     while(n>0){
    //         d = n%10;
    //         n/=10;
    //         sum += d*(int)Math.pow(10, pow);
    //         pow--;
    //     }
    //     return sum;
    // }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        digitsOfNum(n);
        // System.out.println(n/(int)Math.pow(10, 0));
    }
    
}
