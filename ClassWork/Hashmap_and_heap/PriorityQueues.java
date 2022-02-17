import java.util.PriorityQueue;

public class PriorityQueues {
    public static void main(String[] args){
        int[] arr = {1,21,57,92,13,43,22,21,6};

        // create 
        PriorityQueue<Integer> pq = new PriorityQueue<>();   //by default min PQ
        for(int ele : arr){
            pq.add(ele);      // T.C -> for 1 ele = log(n) so, for adding n elements nlog(n)

        }
        while(pq.size() != 0){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
