import java.util.Scanner;

public class twoDarr90rot {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        display(arr);

        transpose(arr);
        reverse(arr);
        display(arr);
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

    public static void reverse(int[][] arr){

        for(int i = 0;i<arr.length; i++){
            int l = 0;
            int h = arr.length - 1;
            while(l<=h){
                int temp = arr[i][l];
                arr[i][l] = arr[i][h];
                arr[i][h] = temp;
                l++;
                h--;
            }
        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length ; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
