import java.util.Scanner;
public class toggleCase {

    // public static String toggleCase(String str){
    //     String ans = "";
    //     String s = "";
    //     for(int i = 0; i<str.length(); i++){
    //         char val = str.charAt(i);
    //         if(Character.isUpperCase(val)){
    //             s = String.valueOf(val).toLowerCase();
    //             ans+=s;
    //         }else{
    //             s = String.valueOf(val).toUpperCase();
    //             ans+=s;
    //         }
    //     }
    //     return ans;
    // }

    public static String toggleCase2(String s){
        StringBuilder ans  = new StringBuilder();
        for(int i = 0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch<='Z'){
                // ise hm lower case bnayenge
                char lc = (char)(ch - 'A' + 'a');
                ans.append(lc);
            }else{
                //  ise hm uppercase bnayenge
                char uc = (char)(ch - 'a' +'A');
                ans.append(uc);
            }
        }
        return ans.toString();
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggleCase2(str));
    }
}
