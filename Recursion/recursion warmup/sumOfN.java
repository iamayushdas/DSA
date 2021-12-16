import java.util.Scanner;
public class sumOfN {
    public static void sumOfN(int i , int n, int sum){
        if(i == n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum += i;
        sumOfN(i+1, n, sum);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int n = scn.nextInt();
        int sum = scn.nextInt();
        sumOfN(i, n, sum);
    }    
}
