import java.util.Scanner;

public class maxSumNonAdjEle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int inc = arr[0];
        int exc = 0;

        for(int i = 1; i<n; i++){
            int newInc = exc + arr[i];
            int newExc = Math.max(inc, exc);

            inc = newInc;
            exc = newExc;
        }

        System.out.println(Math.max(inc, exc));
    }
}
