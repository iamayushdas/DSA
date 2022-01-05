import java.util.ArrayList;
import java.util.Scanner;
public class getMazePath {
    public static ArrayList<String> getMazePath(int sr, int sc , int dr, int dc){
        // Base case
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        if(sc+1<=dc){
            ArrayList<String> hCall = getMazePath(sr, sc+1, dr, dc);
            for(String ele : hCall){
                myAns.add("h"+ ele);
            }
        }
        if(sr+1<=dr){
            ArrayList<String> vCall = getMazePath(sr+1, sc, dr, dc);
            for(String ele : vCall){
                myAns.add("v" + ele);
            }
        }
        return myAns;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m= scn.nextInt();

        ArrayList<String> ans = getMazePath(0, 0, n-1, m-1);
        System.out.println(ans);
    }
}
