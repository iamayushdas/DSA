import java.util.Scanner;
public class stringCompression {

    public static String compression1(String str1){
        String ans = "" + str1.charAt(0);
        for(int i = 1; i<str1.length(); i++){
            if(str1.charAt(i) != str1.charAt(i-1)){
                ans+=str1.charAt(i);
            }
        }
        return ans;
    }
    public static String compression2(String str1){
        String ans = "" + str1.charAt(0);
        int count = 1;
        for(int i = 1; i<str1.length(); i++){
            if(str1.charAt(i) == str1.charAt(i-1)){
                count++;
            }else{
                ans+=((count==1)?"" :Integer.toString(count)) + str1.charAt(i);
                count = 1;
            }
        }
//last vala count handle kia
        if(count>1){
            ans+=count;
        }
        return ans;
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        System.out.println(compression1(str1));
        System.out.println(compression2(str1));
    }
}
