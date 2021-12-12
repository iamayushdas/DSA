import java.util.Scanner;
public class toggleCase {

    public static String toggleCase(String str){
        String ans = "";
        String s = "";
        for(int i = 0; i<str.length(); i++){
            char val = str.charAt(i);
            if(Character.isUpperCase(val)){
                s = String.valueOf(val).toLowerCase();
                ans+=s;
            }else{
                s = String.valueOf(val).toUpperCase();
                ans+=s;
            }
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        System.out.println(toggleCase(str));
    }
}
