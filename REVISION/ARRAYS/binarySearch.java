import java.time.YearMonth;
import java.util.Scanner;

public class binarySearch {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ele = scn.nextInt();
        binarySearch(arr, ele);
    }   

    public static void binarySearch(int[] arr, int ele) {
        int low = 0 , high = arr.length-1;
        while(low<=high){
            int mid = (low+high)/2;

            if(ele<arr[mid]){
                high = mid - 1;
            }else if(ele>arr[mid]){
                low = mid + 1;
            }else if(ele == arr[mid]){
                System.out.println(mid);
                return;
            }
        }
        System.out.println(-1);
    }
}
