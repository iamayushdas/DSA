import java.util.Scanner;
public class firstIdxLastIdx {
    public static int firstIndex(int[] arr,int x){
        int li = 0;
        int ri = arr.length;
        int fi = -1;
        while(li<=ri){
            int mid = (li + ri)/2;
            if(arr[mid] == x){
                fi = mid;
                ri = mid - 1;
            }else if(arr[mid] >  x){
                ri = mid - 1;
            }else{
                li = mid + 1;
            }
        }
        return fi;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        int x = scn.nextInt();

        System.out.println(firstIndex(arr, x));
    }
}
