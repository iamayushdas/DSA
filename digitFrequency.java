import java.util.Scanner;
public class digitFrequency {
    public static void getDigitFrequency(int num, int d){
        int count=0 , digit = 0;
        while(num!=0){
            digit = num%10;
            if(digit == d){
                count++;
            }
            num/=10;
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int d = scn.nextInt();
        getDigitFrequency(num, d);
    }
}
