import java.util.HashMap;
import java.util.Scanner;

public class get_common_element_1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n1 = scn.nextInt();
        int[] a = new int[n1];
        for(int i = 0; i<a.length; i++){
            a[i] = scn.nextInt();
        }

        int n2 = scn.nextInt();
        int[] b = new int[n2];
        for(int i = 0; i<b.length; i++){
            b[i] = scn.nextInt();
        }

        // FreqMap of an array
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int ele: a){
            hm.put(ele, hm.getOrDefault(ele, 0) + 1);
        }

        for(int ele : b){
            if(hm.containsKey(ele)){
                System.out.println(ele);

                // remove
                hm.remove(ele);
            }
        }
    }
}
