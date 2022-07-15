import java.util.Scanner;
public class rotate1D {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void reverse(int[] arr, int li, int ri){
        while(li<=ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }

    public static void rotate(int[] arr, int r){
        int n = arr.length;
        reverse(arr, 0, n-r-1);
        reverse(arr, n-r, n-1);
        reverse(arr, 0, n-1);
    }

    public static void display(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int r = scn.nextInt();
        int[] arr = new int[n];
        input(arr);
        rotate(arr, r);
        display(arr);
    }
}
