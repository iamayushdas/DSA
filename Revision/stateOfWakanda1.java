import java.util.Scanner;
public class stateOfWakanda1 {
    public static Scanner scn = new Scanner(System.in);

    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        for(int j = 0; j<m; j++){
            if(j%2==0){
                for(int i = 0; i<n; i++){
                    System.out.print(arr[i][j] + " ");
                }
            }else{
                for(int i = n-1; i>=0; i--){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

}
