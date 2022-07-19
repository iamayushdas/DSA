import java.util.Scanner;

public class subString {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();

        // without substring method
        for(int i = 0; i<s.length(); i++){
            for(int j = i; j<s.length(); j++){
                for(int k = i; k<=j; k++){
                    System.out.print(s.charAt(k) + " ");
                }

                System.out.println();
            }
        }

        // solution 2 by substring() method

        for(int i = 0; i<s.length(); i++){
            for(int j = i + 1; j<=s.length(); j++){
                System.out.println(s.substring(i, j));
            }
        }
    }
}
