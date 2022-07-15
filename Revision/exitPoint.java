import java.util.Scanner;
public class exitPoint{
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void exit(int[][] arr){
        int dir = 0;
        int i = 0;
        int j = 0;
        int n = arr.length;
        int m = arr[0].length;
        while(true){
            dir+=arr[i][j];
            dir%=4;  //4 directions
            if(dir == 0){
                j++;
            }else if(dir == 1){
                i++;
            }else if(dir == 2){
                j--;
            }else{
                // dir == 3
                i--;
            }

            if(i<0 || i>=n || j<0 || j>=m){
                break;
            }
        }

        if(i<0){
            i++;
        }else if(i>=n){
            i--;
        }else if(j<0){
            j++;
        }else if(j>=m){
            j--;
        }

        System.out.println(i);
        System.out.println(j);
    }
    public static void main(String[] args){
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        input(arr);
        exit(arr);
    }
}