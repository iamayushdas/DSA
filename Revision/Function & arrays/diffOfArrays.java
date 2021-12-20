import java.util.Scanner;
public class diffOfArrays {
    public static int[] differenceOfArray(int[] A, int[] B){
        int n1 = A.length;
        int n2 = B.length;
        int[] ans = new int[n2];

        int i = n1-1;
        int j = n2-1;
        int k = ans.length-1;

        int borrow = 0;

        while(k>=0){
            int diff = 0;

            if(j>=0){
                diff = borrow + B[j];
            }

            if(i>=0){
                diff -= A[i];
            }

            if(diff<0){
                diff+=10;
                borrow = -1;
            }else{
                borrow = 0;
            }

            ans[k] = diff;

            i--;
            j--;
            k--;

        }

        return ans;
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

        int[] ans = differenceOfArray(A, B);
        // EDGE CASES

        //  1.  First non-zero index -- fnzi
        int fnzi = -1;
        for(int i = 0; i<ans.length; i++){
            if(ans[i] != 0){
                fnzi = i;
                break;
            }
        }

        if(fnzi == -1){
            System.out.println("0");
        }

        for(int i = fnzi ; i<ans.length ; i++){
            System.out.println(ans[i]);
        }
    }
}