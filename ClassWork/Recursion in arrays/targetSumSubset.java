import java.util.Scanner;
public class targetSumSubset {
    public static void printTargetSumSubsets(int[] arr, int idx, String asf, int sum, int tar){
        if(sum>tar){
            return;
        }
        if(idx == arr.length){
            if(tar == sum){
                System.out.println(asf + ".");
            }
            return;
        }

        // picked
        printTargetSumSubsets(arr, idx+1, asf + arr[idx] + ", ", sum + arr[idx], tar);

        // not picked
        printTargetSumSubsets(arr, idx+1, asf, sum, tar);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int idx = 0; idx<n; idx++){
            arr[idx] = scn.nextInt();
        }
        int tar = scn.nextInt();
        printTargetSumSubsets(arr, 0, "", 0, tar);
    }
}
