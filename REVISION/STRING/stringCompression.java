import java.util.Scanner;

public class stringCompression {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        compression1(str);
        compression2(str);
    }

    public static void compression1(String str){
        String s = str.charAt(0) + "";
        for(int i = 1; i<str.length(); i++){
            char curCh = str.charAt(i);
            char preCh = str.charAt(i-1);
            if(preCh != curCh){
                s += curCh;
            }
        }
        System.out.println(s);
    }

    public static void compression2(String str){
        String s = str.charAt(0) + "";
        int count = 1;
        for(int i = 1; i<str.length(); i++){
            char curCh = str.charAt(i);
            char preCh = str.charAt(i-1);
            if(preCh != curCh){
                if(count > 1){
                    s += count;
                    count = 1;
                }
                s += curCh;
            }else{
                count++;
            }
        }

        if(count > 1){
            s += count;
        }
        System.out.println(s);
    }
}
