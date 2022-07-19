import java.util.Scanner;

public class demo {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);

        // String s1 = scn.next();
        // String s2 = scn.next();

        // System.out.println(s1);
        // System.out.println(s2);


        // String s = scn.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());


        // char ch = s.charAt(0);
        // System.out.println(ch);


        // for(int i = 0; i<s.length(); i++){
        //     System.out.println(s.charAt(i));
        // }


        // System.out.println(s.substring(0, 1));


        // how to add two string

        // System.out.println(s1 + " " +  s2);
        // System.out.println(s1.concat(" ".concat(s2)));


        // split string
        String str = "abc def ghi jkl";
        String[] parts = str.split(" ");

        for(String val : parts){
            System.out.println(val);
        }


    }
}
