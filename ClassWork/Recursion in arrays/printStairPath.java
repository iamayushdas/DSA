import java.util.Scanner;
public class printStairPath {
    public static void printStairPath(int n, String path){
        if(n==0){
            System.out.println(path);
            return;
        }
        // if(n-1>=0){
        //     printStairPath(n-1, path + "1");
        // }
        // if(n-2>=0){
        //     printStairPath(n-2, path + "2");
        // }
        // if(n-3>=0){
        //     printStairPath(n-3, path + "3");
        // }
        for(int i = 1; i<=3; i++){
            if(n-i>=0){
                printStairPath(n-i, path + i);
            }
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printStairPath(n, "");
    }
}
