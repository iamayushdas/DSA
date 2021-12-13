import java.util.Scanner;

public class countDigit {
    public static void countDigit(int num){
       int count = 0;
        while(num>0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        countDigit(num);
    }
}
