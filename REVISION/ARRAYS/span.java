import java.util.Scanner;

public class span {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int  n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int max = max(arr);
        int min = min(arr);

        System.out.println(max-min);
    }

    public static int max(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        return max;
    }

    public static int min(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
