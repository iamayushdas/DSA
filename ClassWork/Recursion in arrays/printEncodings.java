import java.util.Scanner;
public class printEncodings {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.next();
        printEncodings(s, "" );
    }

    public static void printEncodings(String str, String asf){
        if(str.length() == 0){
            System.out.println(asf);
            return;
        }
        if(str.charAt(0) == '0'){
            return;
        }
        
        char ch1 = str.charAt(0);
        int v1 = ch1 - '0';
        printEncodings(str.substring(1), asf + (char)(v1 + 'a' - 1));

        if(str.length() > 1){
            char ch2 = str.charAt(1);
            int v2 = ch2 - '0';
            int num = v1 * 10 + v2;
            if(num <= 26){
                printEncodings(str.substring(2), asf + (char)(num + 'a' - 1));
            }
        }

    }
}
