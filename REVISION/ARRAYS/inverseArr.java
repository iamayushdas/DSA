import java.util.Scanner;

public class inverseArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int[] inv = inverseArr(arr);

        display(inv);
    }
    public static int[] inverseArr(int[] arr){

        int[] inv = new int[arr.length];
        int i = 0;
        int j = arr.length - 1;

        while(i<=j){
            int val = arr[i];
            inv[val] = i; 
            i++;
        }
        return inv;
    }

    public static void display(int[] arr){
        for(int i = 0; i<arr.length ; i++){
            System.out.println(arr[i]);
        }
    }
}
