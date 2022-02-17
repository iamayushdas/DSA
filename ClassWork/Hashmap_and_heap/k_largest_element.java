import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class k_largest_element {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();

        // PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        // for(int ele : arr){
        //     pq.add(ele);
        // }

        // for(int i = 0; i<k ; i++){
        //     System.out.println(pq.peek());
        //     pq.remove();
        // }

        // sir's method
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            if(i<k){
                pq.add(arr[i]);
            }else{
                if(pq.peek() < arr[i]){
                    pq.remove();
                    pq.add(arr[i]);
                }
            }
        }

        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }
}
