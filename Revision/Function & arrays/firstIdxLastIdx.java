import java.util.Scanner;
public class firstIdxLastIdx {
    public static void firstIdx(int[] arr, int data){
        int fi = -1;
        for(int i = 0 ; i<arr.length-1; i++){
            if(arr[i] == data){
                fi = i;
                System.out.println(fi);
                return;
            }
        }
        System.out.println(fi);
    }
    public static void LastIdx(int[] arr, int data){
        int li = -1;
        for(int i = arr.length-1 ; i>=0; i--){
            if(arr[i] == data){
                li = i;
                System.out.println(li);
                return;
            }
        }
        System.out.println(li);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n= scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int data = scn.nextInt();
        firstIdx(arr, data);
        LastIdx(arr, data);
    }
}
