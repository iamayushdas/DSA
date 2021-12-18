import java.util.Scanner;
public class invertedBarChart {
    public static int maxHeight(int[] arr){
        int max = (int)(-1e8);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    public static void printBarChart(int[] arr){
        int max = maxHeight(arr);
        for(int floor = 1; floor <= max; floor++){
            for(int building = 0; building<arr.length; building++){
                if(arr[building] >= floor){
                    System.out.print("*\t");
                }else{
                    System.out.print("\t");
                }
    
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        // System.out.println(maxHeight(arr));
        printBarChart(arr);
    }
}
