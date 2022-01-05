import java.util.Scanner;

public class printMazePath {
    public static void printMazePath(int sr, int sc, int dr, int dc , String asf){
        if(sr==dr && sc == dc){
            System.out.println(asf);
            return;
        }
        if(sc+1<=dc){
            printMazePath(sr, sc+1, dr, dc, asf + "h");
        }
        if(sr+1<=dr){
            printMazePath(sr+1, sc, dr, dc, asf + "v");
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        printMazePath(0, 0, n-1, m-1, "");
    }
}
