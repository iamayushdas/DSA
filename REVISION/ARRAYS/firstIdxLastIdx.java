import java.util.Scanner;

public class firstIdxLastIdx {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ele = scn.nextInt();

        firstIndex(arr, ele);
        lastIndex(arr, ele);
    }

    public static void firstIndex(int[] arr, int ele){
        int low = 0;
        int high = arr.length;
        int fi = (int)(-1e8);

        while(low<=high){
            int mid = (low+high)/2;

            if(ele<arr[mid]){
                high = mid - 1;
            }else if(ele>arr[mid]){
                low = mid + 1;
            }else{
                fi = mid;
                high = mid - 1;
            }
        }

        System.out.println(fi);
    }

    public static void lastIndex(int[] arr, int ele){
        int low = 0;
        int high = arr.length;
        int li = (int)(1e8);

        while(low<=high){
            int mid = (low+high)/2;

            if(ele<arr[mid]){
                high = mid - 1;
            }else if(ele>arr[mid]){
                low = mid+1;
            }else{
                li = mid;
                low = mid + 1;
            }
        }

        System.out.println(li);
    }


}
