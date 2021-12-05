import java.util.Scanner;
public class subsets {
    public static void subset(int[] arr){
        // total -- 2^n
        int n = arr.length;
        int total = (int)Math.pow(2, n);

        // total number of subset print
        for(int i = 0; i<total; i++){
            String str = "";
            int temp = i;
            // i=0 -----> 0 0 0
            for(int j = n-1; j>=0 ; j--){
                int r = temp%2;
                temp = temp/2;
                if(r == 0){
                    // -
                    str = "-\t" + str;
                }else{
                    // val
                    str = arr[j] + "\t" + str;
                }
            }
            System.out.println(str);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }

        subset(arr);
    }
}
