package REVISION.RECURSION;

import java.util.Scanner;

public class maxInArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int [] arr= new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println(maxInArr(arr, 0));
    }

    public static int maxInArr(int[] arr, int idx){
        if(idx == arr.length - 1){
            return arr[idx];
        }
        int misp = maxInArr(arr, idx + 1);
        if(misp > arr[idx]) return misp;
        return arr[idx];
    }
}
