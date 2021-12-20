import java.util.Scanner;
public class sumOfArray {
    public static int[] sumOfArray(int[] A, int[] B){
        int n1 = A.length;
        int n2 = B.length;
        int[] ans = new int[(n1>n2)?n1:n2];

        int i = n1-1;
        int j = n2-1;
        int k = ans.length-1;

        int carry = 0;

        while(k>=0){
            int sum = 0;
            sum += carry;

            if(i>=0){
                sum += A[i];
            }
            if(j>=0){
                sum+= B[j];
            }

            int val = sum%10;
            carry = sum/10;

            ans[k] = val;

            i--;
            j--;
            k--;

        }

        if(carry != 0){
            System.out.println(carry);
        }

        return ans;
    }

    public static void display(int[] ans){
        for(int val : ans){
            System.out.println(val);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] A = new int[n1];
        for(int i = 0; i<A.length; i++){
            A[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] B = new int[n2];
        for(int i = 0; i<B.length ;i++){
            B[i] = scn.nextInt();
        }

        int[] ans = sumOfArray(A, B);
        display(ans);
    }
}
