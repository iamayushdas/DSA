import java.util.Scanner;
public class barChart {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int[] arr = new int[n];

        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }

        barChart(arr);
    }

    public static void barChart(int[] arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int floor = max ; floor>=1; floor--){
            for(int building = 0; building<arr.length; building++){
                if(arr[building] >= floor ){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }


}
