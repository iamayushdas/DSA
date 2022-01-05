import java.security.Principal;
import java.util.Scanner;
public class knightTour {

    static int[][] dir = {{-2,1}, {-1,2}, {1,2}, {2,1}, {2,-1}, {1,-2}, {-1,-2}, {-2,-1}};
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[][] chess = new int[n][n];

        // position start
        int r = scn.nextInt();
        int c = scn.nextInt();

        printKnightTour(chess, r, c, 1);
    }

    public static void printKnightTour(int[][] chess, int r , int c , int upcomingmove){
        // bahar to nahi chala gya?
        if(r<0 || c<0 || r>=chess.length || c>=chess.length || chess[r][c] != 0){
            return;
        }

        // ans mil gya
        if(upcomingmove == chess.length * chess.length){
            chess[r][c] = upcomingmove;
            display(chess);
            chess[r][c] = 0;
            return;
        }

        // mark
        chess[r][c] = upcomingmove;

        // calls
        for(int d = 0; d<dir.length; d++){
            int x = r + dir[d][0];
            int y = c + dir[d][1];
            printKnightTour(chess, x, y, upcomingmove+1);
        }

        chess[r][c] = 0;
    }

    public static void display(int[][] chess){
        for(int i = 0; i<chess.length; i++){
            for(int j = 0; j<chess.length; j++){
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
