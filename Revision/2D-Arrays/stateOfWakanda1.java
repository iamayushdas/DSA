import java.util.Scanner;
public class stateOfWakanda1 {
    public static void sow1(int[][] arr, int n1, int m1){
        for(int j = 0; j<arr[0].length; j++){
            if(j%2==0){
                for(int i = 0; i<arr.length; i++){
                    System.out.println(arr[i][j]);
                }
            }else{
                for(int i = arr.length-1; i>=0; i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int m1 = scn.nextInt();
        int[][] arr = new int[n1][m1];
        for(int i = 0; i<n1; i++){
            for(int j = 0; j<m1; j++){
                arr[i][j] = scn.nextInt();
            }
        }
        sow1(arr, n1, m1);
    }
}
