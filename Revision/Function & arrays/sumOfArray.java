import java.util.Scanner;
public class sumOfArray {
    public static void sumOfArray(int[] A, int[] B){
        int n1 = A.length;
        int n2 = B.length;

        int[] ans = new int[(n1>n2)?n1:n2];

        int i = n1-1;
        int j = n2-1;
        int k = ans.length - 1;
        int carry = 0;
        while(k>=0){
            int sum = carry ;
            if(i>=0){
                sum += A[i];
            }

            if(j>=0){
                sum += B[j]; 
            }

            carry = sum/10;
            sum%=10;

            ans[k] = sum;

            i--;
            j--;
            k--;
        }

        if(carry != 0){
            System.out.println(carry);
        }

        for( int val: ans){
            System.out.println(val);
        }

    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] arr1 = new int[n1];

        for(int i = 0; i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] arr2 = new int[n2];

        for(int i = 0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }

        System.out.println("'ANSWER'");
        sumOfArray(arr1, arr2);
    }
}
