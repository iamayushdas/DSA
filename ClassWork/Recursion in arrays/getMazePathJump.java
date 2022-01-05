import java.util.ArrayList;
import java.util.Scanner;
public class getMazePathJump {
    public static ArrayList<String> getMazePath(int sr, int sc , int dr, int dc){
        // Base case
        if(sr == dr && sc == dc){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        ArrayList<String> myAns = new ArrayList<>();
        for(int jump = 1; sc + jump <= dc ; jump++){
            ArrayList<String> hCall = getMazePath(sr, sc+jump, dr, dc);
            for(String ele : hCall){
                myAns.add("h"+ jump + ele);
            }
        }
        for(int jump = 1; sr + jump <= dr; jump++){
            ArrayList<String> vCall = getMazePath(sr+jump, sc, dr, dc);
            for(String ele : vCall){
                myAns.add("v" + jump + ele);
            }
        }

        for(int jump = 1; sr+jump <= dr && sc+jump <= dc; jump++){
            ArrayList<String> dCall = getMazePath(sr+jump, sc+jump, dr, dc);
            for(String ele : dCall){
                myAns.add("d" + jump + ele);
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
