import java.util.Scanner;
public class primeFactorisation {
    public static void prime(int n){
        int count = 2;
        while((count*count)<=n){
            if(n%count==0){
                n/=count;
                System.out.print(count+" ");
            }else{
                count++;
            }
        }
        if(n>2){
            System.out.print(n);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        prime(n);
    }
}
