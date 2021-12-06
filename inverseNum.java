import java.util.Scanner;
public class inverseNum {
    public static int count(int n){
        int count = 0;
        while(n>0){
            n/=10;
            count++;
        }
        return count;
    }

    public static int inverse(int n){
        int sum = 0 , iv = 0;
        while(n>0){
            int od = n%10;
            iv++;
            sum+=iv*(int)Math.pow(10, od-1);
            n/=10;
        }
        return sum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(inverse(n));
    }
}
