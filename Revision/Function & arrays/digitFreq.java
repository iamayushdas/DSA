import java.util.Scanner;

public class digitFreq {
    public static void digitFreq(int n, int k){
        int count = 0;
        while(n>0){
            int d = n%10;
            n/=10;
            if(d == k){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        digitFreq(n, k);
    }
}
