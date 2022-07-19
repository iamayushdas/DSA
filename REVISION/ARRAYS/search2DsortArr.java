import java.util.Scanner;

public class search2DsortArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[][] arr = new int[n][n];

        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int ele = scn.nextInt();
        search(arr, ele);
    }

    public static void search(int[][] arr, int ele){
        int i = 0;
        int j = arr[0].length - 1;

        while(i<arr.length && j>=0){
            if(ele == arr[i][j]){
                System.out.println(i);
                System.out.println(j);
                return;
            }else if(ele < arr[i][j]){
                j--;
            }else if(ele > arr[i][j]){
                i++;
            }
        }

        System.out.println("element not found");
    }
}
