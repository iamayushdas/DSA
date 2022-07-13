import java.util.Scanner;

public class ceilAndFloor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ele = scn.nextInt();

        ceilAndFloor(arr, ele);
    }
    
    public static void ceilAndFloor(int[] arr, int ele){
        int low = 0, high = arr.length-1;
        int ceil = (int)(-1e8);
        int floor = (int)(1e8);

        while(low<=high){
            int mid = (low+high)/2;

            if(ele<arr[mid]){
                high = mid - 1;
                ceil = arr[mid];
            }else if(ele>arr[mid]){
                low = mid + 1;
                floor = arr[mid];
            }else{
                ceil = arr[mid];
                floor = arr[mid];
                break;
            }
        }

        System.out.println("Ceil is: " + ceil + " floor is: " + floor);
    }


}
