import java.util.Scanner;


public class peakElement {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int pe = peakElement(arr, n);
        if(pe < 0 || pe >=n){
            System.out.println(0);
        }else{
            System.out.println(1);
        }
    }

    public static int peakElement(int arr[] , int n){
        int s = 0;
        int e = n-1;
        int mid = 0;
        
        while(s<=e){
            mid = (s+e)/2;
            if((mid == 0 || arr[mid-1] <= arr[mid]) && (mid == n-1 || arr[mid + 1] <= arr[mid])){
                return mid;
            }
            else if(mid > 0 && arr[mid-1] > arr[mid]){
                e = mid -1;
            }else if(mid < n-1 && arr[mid] < arr[mid+1]){
                s = mid + 1;
            }
        }
        return mid;
        
    }
}
