import java.util.Scanner;

public class saddlePoint {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in)
            int n = scn.nextInt();

            int[][] arr = new int[n][n];

            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[0].length; j++){
                    arr[i][j] = scn.nextInt();
                }
            }
    }

    
}
