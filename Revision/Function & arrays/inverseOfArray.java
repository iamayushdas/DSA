import java.util.Scanner;
public class inverseOfArray {
    public static int[] inverse(int[] arr, int[] inv){
        for(int i = 0; i<arr.length ; i++){
            int val = arr[i];
            inv[val] = i;
        }

        return inv;
    }
    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int[] inv = new int[n];
        inverse(arr, inv);
        display(inv);
    }
}
