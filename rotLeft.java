import java.util.Scanner;
public class rotLeft {
        public static void rotLeft(int[] a, int d) {
    // Write your code here
        d = d%a.length;
        if(d<0){
            d+=a.length;
        }
        int n = a.length;
        reverse(a, 0, n-d-1);
        reverse(a, n-d, n-1);
        reverse(a, 0, n-1);
    }
    
    public static void reverse(int[] arr, int i , int j){
        while(i<=j){
            swap(arr, i, j);
            i++;
            j--;
        }
    }
    
    public static void swap(int[] arr, int i ,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void display(int[] a){
        for(int i = 0 ; i<a.length; i++){
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        
        int[] a = new int[n];
        for(int i = 0; i<n; i++){
            a[i] = scn.nextInt();
        }
        
        rotLeft(a, d);
        display(a);
}
}

