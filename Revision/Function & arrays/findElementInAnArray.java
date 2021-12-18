import java.util.Scanner;
public class findElementInAnArray {

    public static int findEle(int[] arr, int d){
        int ans = -1;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == d){
                ans = i;
                break;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        int ans = findEle(arr, d);
        System.out.println(ans);
    }
}
