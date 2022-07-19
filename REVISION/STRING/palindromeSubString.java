import java.util.Scanner;

public class palindromeSubString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        for(int i = 0; i<s.length(); i++){
            for(int j = i+1; j<=s.length(); j++){
                String ss = s.substring(i,j);
                if(isPalindrome(ss) == true){
                    System.out.println(ss);
                }
            }
        }
    }

    public static boolean isPalindrome(String ss){
        int li = 0;
        int ri = ss.length() - 1;
        
        while(li <= ri){
            char c1 = ss.charAt(li);
            char c2 = ss.charAt(ri);
            if(c1 == c2){
                li++;
                ri--;
            }else{
                return false;
            }
        }

        return true;
    }
}
