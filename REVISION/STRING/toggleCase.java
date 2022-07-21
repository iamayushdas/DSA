import java.util.Scanner;

public class toggleCase {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        toggleCase(str);
    }


    public static void toggleCase(String str){
        StringBuilder sb = new StringBuilder(str);

        for(int i = 0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(ch >= 'a' && ch <='z'){
                char uc = (char)('A' + ch - 'a');
                sb.setCharAt(i, uc);
            }else{
                char lc = (char)('a' + ch - 'A');
                sb.setCharAt(i, lc);
            }
        }

        System.out.println(sb);
    }
}
