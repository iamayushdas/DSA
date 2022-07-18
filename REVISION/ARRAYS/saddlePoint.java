import java.util.Scanner;

public class saddlePoint {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
            int n = scn.nextInt();

            int[][] arr = new int[n][n];

            for(int i = 0; i<arr.length; i++){
                for(int j = 0; j<arr[0].length; j++){
                    arr[i][j] = scn.nextInt();
                }
            }

        saddlePoint(arr);
    }

    public static void saddlePoint(int[][] arr) {
        for(int i = 0; i<arr.length; i++){

            // column ka chota element nikaalne k liye
            int lcvi = 0;
            for(int j = 1; j<arr[0].length; j++){
                if(arr[i][lcvi] > arr[i][j]){
                    lcvi = j;
                }
            }

            boolean flag = true;
            for(int k = 0; k<arr.length; k++){
                if(arr[k][lcvi] > arr[i][lcvi]){
                    flag = false;
                    break;
                }
            }

            if(flag == true){
                System.out.println(arr[i][lcvi]);
                return;
            }
        }

        System.out.println("invalid input");
    }
}
