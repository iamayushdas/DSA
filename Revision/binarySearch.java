import java.util.Scanner;
public class binarySearch {
    public static int bs(int[] arr, int x){
        int li = 0, ri = arr.length - 1;

        while(li<=ri){
            int mid = (li + ri)/2;
            if(arr[mid] == x){
                return mid;
            }else if(arr[mid] > x){
                // left me dhundho
                ri = mid-1;
            }else{
                li = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] arr = {4,6,8,10,12,14,16,18,20,22,24};
        // int x = 20;
        // int x = 24;
        int x = 11;

        int ans = bs(arr, x);
        System.out.println(ans);
    }
}
                                                 