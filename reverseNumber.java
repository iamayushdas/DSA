import java.util.Scanner;
public class reverseNumber {

    public static void reverse(int n){
        while(n>0){
            int d = n%10;
            n/=10;
            System.out.println(d);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        reverse(n);
    }
}
