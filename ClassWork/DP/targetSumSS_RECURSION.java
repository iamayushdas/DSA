import java.util.Scanner;

public class targetSumSS_RECURSION {

    public static boolean solve(int[] arr, int idx, int tar){
        if(idx==arr.length || tar==0){
            if(tar == 0){
                return true;
            }else{
                return false;
            }
        }

        boolean no = solve(arr, idx+1, tar);
        boolean yes = false;
        if(tar - arr[idx] >= 0){
            yes = solve(arr, idx+1, tar-arr[idx]);
        }
        return yes||no;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int tar = scn.nextInt();

        boolean ans = solve(arr, 0, tar);
        System.out.println(ans);
    }
}
