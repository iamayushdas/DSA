import java.util.Scanner;

public class asciiDiffChar {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        asciiDiff(s);
    }

    public static void asciiDiff(String s){
        StringBuilder sb = new StringBuilder();
        sb.append(s.charAt(0));
        for(int i = 1;i<s.length(); i++){
            char curr = s.charAt(i);
            char prev = s.charAt(i-1);
            int diff = curr - prev;
            sb.append(diff);
            sb.append(curr);
        }

        System.out.println(sb);
    }
}
