// span = maximum - mininmum value of an array

import java.util.Scanner;
public class spanOfArray{
    public static int maximum(int[] arr){
        int maximum = (int)(-1e8);
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] > maximum){
                maximum = arr[i];
            }
        }
        return maximum;
    }
    public static int minimum(int[] arr){
        int minimum = (int)(1e8);
        for(int i = 0; i< arr.length ; i++){
            if(arr[i] < minimum){
                minimum = arr[i];
            }
        }
        return minimum;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr  = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(maximum(arr) - minimum(arr));
    }
}