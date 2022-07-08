import java.util.Scanner;

public class rotateAnArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr = new int[n];

        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int k = scn.nextInt();
        rotateArr(arr, k);
        display(arr);
    }

    public static void reverse(int[] arr, int i , int j){

        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void rotateArr(int[] arr, int k){
        int l = arr.length;
        k%=l;
        if(k<0){
            k+=l;
        }
        reverse(arr, 0, l-k-1);
        reverse(arr, l-k, l-1);
        reverse(arr, 0, l-1);
    }

    public static void display(int[] arr){
        for(int i = 0;i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
