import java.util.Scanner;
public class printSubseqence{
    public static void printSubseqence(String str , String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);    //a
        String ros = str.substring(1);  //bc
        printSubseqence(ros, ans + ch);
        printSubseqence(ros, ans);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printSubseqence(s, "");
    }
}