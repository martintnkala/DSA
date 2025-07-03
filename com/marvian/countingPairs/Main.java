package com.marvian.countingPairs;
/*Time complexity is nlogn due to sorting*/
import java.util.*;

public class Main {
    public static void main(String[] args) {

//        Hashtable<Integer, Integer> map = new Hashtable<>();

        int[] numsArray = {1, 7, 5, 9, 2, 12, 3};
        Set<Integer> seen = new HashSet<>();
        int k = 2;
//        Set<Integer> seen = new HashSet<>();
        for (int num : numsArray) {
            if (seen.contains(num - k)) System.out.println((num - k) + ", " + num);
            if (seen.contains(num + k)) System.out.println(num + ", " + (num + k));
            seen.add(num);
        }


//        Arrays.sort(numsArray); // O(nlogn)
//
//        int i = 0, j = 1;
//        while (j < numsArray.length) { // O(n)
//            int diff = numsArray[j] - numsArray[i];
//            if (diff == k) {
//                map.put(numsArray[i], numsArray[j]);
//                j++;
//                i++;
//            } else if
//            (diff < k) {
//                j++;
//            } else {
//                i++;
//                if (i == j) {
//                    j++;
//                }
//            }
//        }
//        System.out.println(map);
    }
}
