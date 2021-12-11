import java.util.Scanner;
public class rotate2D{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static void transpose(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = i; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    public static void reverse1D(int[] arr){
        int li = 0;
        int ri = arr.length-1;
        while(li<=ri){
            int temp = arr[li];
            arr[li] = arr[ri];
            arr[ri] = temp;
            li++;
            ri--;
        }
    }
    public static void reverse2D(int[][] arr){
        for(int[] d: arr){
            reverse1D(d);
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        transpose(arr);
        reverse2D(arr);
        display(arr);
    }
}