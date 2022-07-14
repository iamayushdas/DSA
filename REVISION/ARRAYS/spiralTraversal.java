import java.util.Scanner;

public class spiralTraversal {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();

        int[][] arr = new int[n][m];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = scn.nextInt();
            }
        }

        spiralTraversal(arr, n, m);
    }

    public static void spiralTraversal(int[][] arr, int n, int m) {
        int minr = 0;
        int minc = 0;
        int maxr = arr.length - 1;
        int maxc = arr[0].length - 1;

        int tne = n * m;
        int count = 0;

        while (count < tne) {
            for (int i = minr; i <= maxr && count<tne; i++) {
                System.out.println(arr[i][minc]);
                count++;
            }
            minc++;

            for (int j = minc; j <= maxc && count<tne; j++) {
                System.out.println(arr[maxr][j]);
                count++;
            }
            maxr--;

            for (int i = maxr; i >= minr && count<tne; i--) {
                System.out.println(arr[i][maxc]);
                count++;
            }
            maxc--;

            for (int j = maxc; j >= minc && count<tne; j--) {
                System.out.println(arr[minr][j]);
                count++;
            }
            minr++;

        }

    }
}
