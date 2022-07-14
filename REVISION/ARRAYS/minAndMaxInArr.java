import java.util.Scanner;
public class minAndMaxInArr {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n-1; i++){
            arr[i] = scn.nextInt();
        }

        min(arr);
        max(arr);
    }

    public static void max(int[] arr){
        int max = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);

    }

    public static void min(int[] arr){
        int min = arr[0];
        for(int i = 0;i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        System.out.println(min);
    }
}
