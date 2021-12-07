import java.util.Scanner;
public class twoDrot90 {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void rot90(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;
        for(int j=0; j<m; j++){
            for(int i = n-1; i>=0; i--){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        rot90(arr);
    }
}
