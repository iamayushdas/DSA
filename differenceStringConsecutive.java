import java.util.Scanner;
public class differenceStringConsecutive{
    public static String stringDiff(String s){
        StringBuilder ans = new StringBuilder();
        ans.append(s.charAt(0));
        for(int i = 1; i<s.length(); i++){
           int d =  (s.charAt(i) - s.charAt(i-1));
           ans.append(d);
           ans.append(s.charAt(i));
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        System.out.println(stringDiff(s));
    }
}