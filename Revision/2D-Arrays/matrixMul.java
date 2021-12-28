import java.util.Scanner;
public class matrixMul {
    public static Scanner scn = new Scanner(System.in);
    public static void input(int[][] arr, int n, int m){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                arr[i][j] = scn.nextInt();
            }
        }
    }
    public static int[][] product(int[][] a1, int[][] a2, int n1, int m1, int n2, int m2){
        int[][] prdt= new int[n1][m2];
        for(int i = 0 ; i<prdt.length; i++){
            for(int j = 0; j<prdt[0].length; j++){
                for(int k = 0; k<m1; k++){
                    prdt[i][j] += a1[i][k] * a2[k][j];
                }
            }
        }
        return prdt;
    }

    public static void display(int[][] arr){
        for(int i = 0 ; i<arr.length ; i++){
            for(int j = 0 ; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        int n1 = scn.nextInt();
        int m1  = scn.nextInt();
        int[][] a1 = new int[n1][m1];
        input(a1, n1, m1);
        int n2 = scn.nextInt();
        int m2  = scn.nextInt();
        int[][] a2 = new int[n2][m2];
        input(a2, n2, m2);
        if(m1!=n2){
            System.out.println("invalid input");
            return;
        }
            int[][] prdt = product(a1, a2, n1, m1, n2, m2);
            display(prdt);
    }
}
