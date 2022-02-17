import java.util.Scanner;

import javax.swing.text.MaskFormatter;

import java.util.HashMap;

public class longest_consecutive_sequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scn.nextInt();
        }

        HashMap<Integer, Boolean> hm = new HashMap<>();
        for (int ele : a) {
            hm.put(ele, true);
        }

        for (int ele : a) {
            if (hm.containsKey(ele - 1)) {
                hm.put(ele, false);
            }
        }

        int maxLen = 0;
        int maxStPt = 0;

        for (int ele : a) {
            if (hm.get(ele) == true) {
                int tempLen = 1;
                int tempStPt = ele;

                while (hm.containsKey(tempStPt + tempLen)) {
                    tempLen++;
                }

                if (tempLen > maxLen) {
                    maxLen = tempLen;
                    maxStPt = tempStPt;
                }
            }
        }

        for (int i = maxStPt; i < maxStPt + maxLen; i++) {
            System.out.println(i);
        }
    }
}
