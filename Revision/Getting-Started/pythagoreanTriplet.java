import java.util.Scanner;
public class pythagoreanTriplet {
    public static boolean pt(int a, int b, int c){
        if(a*a == b*b + c*c){
            return true;
        }else if(b*b == a*a + c*c){
            return true;
        }else if(c*c == a*a + b*b){
            return true;
        }
        return false;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        int b = scn.nextInt();
        int c = scn.nextInt();
        System.out.println(pt(a, b, c));
    }
}
