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

    // METHOD-2, Transpose and reverse column wise
    
    // step1 - Transpose
    // step2 - Reverse column wise

    // STEP 1 - transpose
    public static void transpose(int[][] arr){
        int n = arr.length;
        for(int i=0; i<n; i++){
            for(int j = i ; j<n; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }

    

    // Step 2 - reverse column wise
    public static void reverse(int[][] arr){
        int n = arr.length;
        for(int i = 0; i<n; i++){
            int li = 0;
            int  ri = n-1;
            while(li<=ri){
                int temp = arr[i][li];
                arr[i][li] = arr[i][ri];
                arr[i][ri] = temp;
                li++;
                ri--;
            }

        }
    }

    public static void display(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                System.out.print(arr[i][j]+ ", ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int n = scn.nextInt();
        int[][] arr = new int[n][n];
        input(arr);
        // rot90(arr);
        transpose(arr);
        reverse(arr);
        display(arr);
    }
}
