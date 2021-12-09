import java.util.Scanner;
public class twoDarraySearch {
    public static void twoDarraySearch(int[][] arr, int x){
        // top right
        int n = arr.length;
        int i = 0;
        int j = n-1;

        while(j>=0 && i<=n-1){
            int me = arr[i][j];
            if(me==x){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(me>x){
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Not Found");
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int x = scn.nextInt();

        twoDarraySearch(arr, x);
    }
}
