import java.util.Scanner;
public class rotateAnArray {
    public static int[] reverse(int[] arr, int i, int j){
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        return arr;
    }
    public static int[] rotate(int[] arr, int k){
        if(k<0){
            k += arr.length;
        }
        k %= arr.length;
        reverse(arr, 0, arr.length-k-1);
        reverse(arr, arr.length-k , arr.length-1);
        reverse((arr), 0, arr.length-1);
        return arr;
    }
    public static void display(int[] arr){
        for(int val : arr){
            System.out.print(val + " ");
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        rotate(arr, k);
        display(arr);
    }
}
