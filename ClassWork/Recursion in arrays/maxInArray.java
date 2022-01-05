import java.util.Scanner;
public class maxInArray {
    public static int maxInArray(int[] arr, int idx){
        if(idx == arr.length-1){
            return arr[idx];
        }
        int recAns = maxInArray(arr, idx + 1);
        int me = arr[idx];
        if(me > recAns){
            return me;
        }else{ 
            return recAns;
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i< arr.length; i++){
            arr[i] = scn.nextInt();
        }

        int ans = maxInArray(arr, 0);
        System.err.println(ans);
    }
}
