package DSA;
import java.util.Scanner;

public class Patterns {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        // pattern 1
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *
        // * * * * * *

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 2
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < i+1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // or
        // for(int i = 0; i<n; i++){
        // for(int j = 0; j<=i;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 3
        // 1
        // 1 2
        // 1 2 3
        // 1 2 3 4
        // 1 2 3 4 5

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // or

        // for(int i = 1; i<=n; i++){
        // for(int j = 1; j<=i; j++){
        // System.out.print(j+" ");
        // }
        // System.out.println();
        // }

        // pattern 4
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(i + " ");
        // }
        // System.out.println();
        // }

        // or

        // for(int i = 1; i<=n; i++){
        // for(int j = 1; j<=i; j++){
        // System.out.print(i+" ");
        // }
        // System.out.println();
        // }

        // pattern 5
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *

        // for (int i = 0; i < n; i++) {
        // for (int j = i; j < n; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // or

        // for(int i = n; i>=1; i--){
        // for(int j = 1; j<=i; j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 6
        // 1 2 3 4 5
        // 1 2 3 4
        // 1 2 3
        // 1 2
        // 1

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n-i; j++) {
        // System.out.print(j+1+" ");
        // }
        // System.out.println();
        // }

        // or

        // for(int i = 1; i<=n; i++){
        // for(int j = 1; j<=n-i+1; j++){ //n-rows+1
        // System.out.print(j+ " ");
        // }
        // System.out.println();
        // }

        // pattern 7
        // - - - - * - - - -
        // - - - * * * - - -
        // - - * * * * * - -
        // - * * * * * * * -
        // * * * * * * * * *

        // for (int i = 0; i < n; i++) {
        // for (int j = i; j < n-1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2*i+1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // or

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print("- ");
        // }
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("* ");
        // }
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print("- ");
        // }
        // System.out.println();
        // }

        // pattern 8
        // * * * * * * * * *
        // - * * * * * * * -
        // - - * * * * * - -
        // - - - * * * - - -
        // - - - - * - - - -
        // for (int i = n - 1; i >=0; i--) {
        // for (int j = i; j < n - 1; j++) {
        // System.out.print(" ");
        // }
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // or

        // for(int i = 0; i<n; i++){
        // for(int j=0; j<i; j++){
        // System.out.print("- ");
        // }
        // for(int j=0; j<2*n-(2*i+1); j++){
        // System.out.print("* ");
        // }
        // for(int j=0; j<i; j++){
        // System.out.print("- ");
        // }
        // System.out.println();
        // }

        // pattern 9
        // - - - - *
        // - - - * * *
        // - - * * * * *
        // - * * * * * * *
        // * * * * * * * * *
        // - * * * * * * *
        // - - * * * * *
        // - - - * * *
        // - - - - *

        // for (int i = 0; i < n - 1; i++) {
        // for (int j = i; j < n - 1; j++) {
        // System.out.print("- ");
        // }
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        // for (int j = i; j < n - 1; j++) {
        // System.out.print("- ");
        // }
        // for (int j = 0; j < 2 * i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 10
        // *
        // * *
        // * * *
        // * * * *
        // * * * * *
        // * * * * * *
        // * * * * *
        // * * * *
        // * * *
        // * *
        // *
        // for (int i = 0; i < n * 2 + 1; i++) {
        // if (i <= 5) {
        // for (int j = 0; j < i + 1; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // } else {
        // for (int j = i - 1; j < n * 2; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // or

        // for (int i = 1; i <= 2 * n - 1; i++) {
        // int stars = i;
        // if (i > n) {
        // stars = 2 * n - i;
        // }
        // for (int j = 1; j <= stars; j++) {
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

        // pattern 11
        // 1
        // 0 1
        // 1 0 1
        // 0 1 0 1
        // 1 0 1 0 1
        // int start = 1;
        // for (int i = 0; i < n; i++) {
        // if (i % 2 == 0)
        // start = 1;
        // else
        // start = 0;
        // for (int j = 0; j <= i; j++) {
        // System.out.print(start + " ");
        // start = 1 - start;
        // }
        // System.out.println();
        // }

        // Pattern 12
        // 1 - - - - - - - - 1
        // 1 2 - - - - - - 2 1
        // 1 2 3 - - - - 3 2 1
        // 1 2 3 4 - - 4 3 2 1
        // 1 2 3 4 5 5 4 3 2 1

        // for (int i = 1; i <= n; i++) {
        // for (int j = 1; j <= i; j++) {
        // System.out.print(j + " ");
        // }
        // for (int j = 1; j <= 2 * n - 2 * i; j++) {
        // System.out.print("- ");
        // }
        // for (int j = i; j >= 1; j--) {
        // System.out.print(j + " ");
        // }
        // System.out.println();
        // }

        // pattern 13
        // 1
        // 2 3
        // 4 5 6
        // 7 8 9 10
        // 11 12 13 14 15
        // int count = 1;
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(count + " ");
        // count++;
        // }
        // System.out.println();
        // }

        // pattern 14
        // A
        // A B
        // A B C
        // A B C D
        // A B C D E
        // char[] arr = { 'A', 'B', 'C', 'D', 'E' };
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(arr[j] + " ");
        // }
        // System.out.println();
        // }

        // Pattern 15
        // A B C D E
        // A B C D
        // A B C
        // A B
        // A
        // char[] arr = { 'A', 'B', 'C', 'D', 'E' };
        // for (int i = n - 1; i >= 0; i--) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(arr[j] + " ");
        // }
        // System.out.println();
        // }

        // Pattern 16
        // A
        // B B
        // C C C
        // D D D D
        // E E E E E
        // char[] arr = { 'A', 'B', 'C', 'D', 'E' };
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j <= i; j++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();
        // }

        // or // without array

        // for(int i = 0; i<n; i++){
        // char ch = (char) ('A' + i);
        // for(int j = 0; j<=i; j++){
        // System.out.print(ch + " ");
        // }
        // System.out.println();
        // }

        // pattern 17
        // - - - - A - - - -
        // - - - A B A - - -
        // - - A B C B A - -
        // - A B C D C B A -
        // A B C D E D C B A
        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print("- ");
        // }
        // // characters
        // char ch = 'A';
        // int breakpoint = (2 * i + 1) / 2;
        // for (int j = 1; j <= 2 * i + 1; j++) {
        // System.out.print(ch + " ");
        // if (j <= breakpoint) {
        // ch++;
        // } else {
        // ch--;
        // }
        // }
        // for (int j = 0; j < n - i - 1; j++) {
        // System.out.print("- ");
        // }
        // System.out.println();
        // }

        // Pattern 18
        // E
        // D E
        // C D E
        // B C D E
        // A B C D E
        // for(int i = 0; i<n; i++){
        // for(char ch = (char) ('E' - i); ch<= 'E'; ch++){
        // System.out.print(ch+" ");
        // }
        // System.out.println();
        // }

        // pattern 19
        // * * * * * * * * * *
        // * * * * - - * * * *
        // * * * - - - - * * *
        // * * - - - - - - * *
        // * - - - - - - - - *
        // * - - - - - - - - *
        // * * - - - - - - * *
        // * * * - - - - * * *
        // * * * * - - * * * *
        // * * * * * * * * * *
        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 0; j < 2 * i; j++) {
        //         System.out.print("- ");
        //     }
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }
        // for (int i = n - 1; i >= 0; i--) {
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("* ");
        //     }
        //     for (int j = 0; j < 2 * i; j++) {
        //         System.out.print("- ");
        //     }
        //     for (int j = 0; j < n - i; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // pattern 20
        
        scn.close();
    }
}