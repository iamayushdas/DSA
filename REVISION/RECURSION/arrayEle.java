package REVISION.RECURSION;

import java.util.Scanner;

public class arrayEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        arrayEle(arr, 0);
    }

    public static void arrayEle(int[] arr, int idx){
        if(idx == arr.length) return;
        System.out.println(arr[idx]);
        arrayEle(arr, idx+1);
    }

}
 