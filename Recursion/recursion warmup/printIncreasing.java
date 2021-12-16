import java.util.Scanner;
public class printIncreasing {
    public static void printIncreasing(int i , int n){
        if(i == n){
            System.out.println(i);
            return;
        }
        System.out.println(i);
        printIncreasing(i+1, n);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int i = scn.nextInt();
        int n = scn.nextInt();
        printIncreasing(i, n);
    }
}
