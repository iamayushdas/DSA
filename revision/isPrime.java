package revision;
import java.util.Scanner;
public class isPrime {

    public static boolean isPrime(int n){
        for(int i = 2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int l = scn.nextInt();
        int h = scn.nextInt();
        // int[] arr = new int[t];
        // for(int i = 0; i<t; i++){
        //     arr[i] = scn.nextInt();
        // }
        for(int i = l; i<h; i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
