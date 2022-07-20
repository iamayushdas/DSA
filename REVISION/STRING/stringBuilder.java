import java.util.*;

public class stringBuilder {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder("hello");

        // System.out.println(sb);

        // char ch = sb.charAt(0); //get
        // System.out.println(ch);

        // sb.setCharAt(4, 's');   //set
        // System.out.println(sb);

        // sb.insert(5, 'a');      //insert
        // System.out.println(sb);

        // sb.deleteCharAt(5);     //delete
        // System.out.println(sb);


        // sb.append('g');        //add at end
        // System.out.println(sb);

        // System.out.println(sb.length());

        //      PERFORMANCE DECREASE

        int n = 10000000;
        // long start = System.currentTimeMillis();
        // String s = "";
        // for(int i = 0;i<n; i++){
        //     s+=i;
        // }

        // long end = System.currentTimeMillis();
        // System.out.println(s);
        // System.out.println(end - start);


        long start = System.currentTimeMillis();
        StringBuilder sb1 = new StringBuilder("");
        for(int i = 0; i<n; i++){
            sb1.append(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(sb1);

        System.out.println("duration is " + (end - start));


    }
}
