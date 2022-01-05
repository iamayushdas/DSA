import java.util.Scanner;
public class stringPermutation {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printStringPermutation(s, "");
    }

    public static void printStringPermutation(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            String ros = str.substring(0, i) + str.substring(i+1);
            printStringPermutation(ros, asf + ch);
        }
    }
}
