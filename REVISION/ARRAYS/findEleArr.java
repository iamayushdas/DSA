import java.util.Scanner;

public class findEleArr {
public static void main(String[] args){
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();


    int[] arr = new int[n];
    for(int i = 0;i<arr.length; i++){
        arr[i] = scn.nextInt();
    }

    int e = scn.nextInt();

    int ans = findEle(arr, e);
    System.out.println(ans);
}

public static int findEle(int[] arr, int e){
    for(int i = 0; i<arr.length; i++){
        if(arr[i] == e){
            return i;
        }
    }
    
    return -1;
}
}
