import java.util.Scanner;
public class arrays {
    public static Scanner scn = new Scanner(System.in);
    public static void takeInput(int[] arr){
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }

    public static void printElements(int[] arr){
        for(int i = 0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    public static boolean findElement(int[] arr, int data){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == data) {
                return true;
            }
        }
        return false;
    }

    public static int maximum(int[] arr){
        int n = arr.length, maxElement = Integer.MIN_VALUE;

        for(int i = 0; i<n; i++){
            maxElement = Math.max(maxElement, arr[i]);
        }
        return maxElement;
    }

    public static int minimum(int[] arr){
        int n = arr.length, minElement = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++){
            minElement = Math.min(minElement, arr[i]);
        }
        return minElement;
    }

    public static int spanArray(int[] arr){
        int span = maximum(arr) - minimum(arr);
        System.out.println(span);
        return span;
    }

    // public static void firstIndex(int[] arr, int ele){
    //     for(int i = 0; i<arr.length; i++){
    //         if(arr[i] == ele){
    //             System.out.println("firstIndex of " + ele + " is " +i);

    //         }
    //     }
    // }

    //  SPAN OF ARRAY USING DIFF APPROACH


    public static void main(String[] args){
        int n = scn.nextInt();
        int[] arr = new int[n];
        int ele = scn.nextInt();
        takeInput(arr);
        // printElements(arr);
        // findElement(arr, data);
        // spanArray(arr);
        firstIndex(arr, ele);

        // System.out.println(maximum(arr);
        

    }
}
