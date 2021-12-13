// 5 * 1 = 5
// 5 * 2 = 10
// 5 * 3 = 15
// 5 * 4 = 20
// 5 * 5 = 25
// 5 * 6 = 30
// 5 * 7 = 35
// 5 * 8 = 40
// 5 * 9 = 45
// 5 * 10 = 50
import java.util.Scanner;
public class pattern14 {
    public static void pattern14(int n){
        for(int r = 1; r<=10; r++){
            System.out.println(n+" * "+ r + " = " + n*r);
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        pattern14(n);
    }
}
