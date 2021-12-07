import java.util.Scanner;
public class spiral {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr){
        for(int i =  0; i<arr.length; i++){
            for(int j = 0; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }

    public static void spiral(int[][] arr){
        int n = arr.length;
        int m = arr[0].length;

        //  4 walls create;

        int minR = 0;
        int minC = 0;
        int maxR = n-1;
        int maxC = m-1;

        int count = 0;
        int total = n*m;

        while(count<total){
            for(int i = minR ; i<=maxR; i++){
                System.out.println(arr[i][minC]);
                count++;
            }
            minC++;

            for(int j = minC ; j<=maxC && count< total; j++){
                System.out.println(arr[maxR][j]);
                count++;
            }
            maxR++;

            
        }


    }
    public static void main(String[] args){

    }
}
