package Comparator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class test {
    public static void main(String[] args) {
        List<String> arr=  Arrays.asList("Atharva","is","great");
        Collections.sort(arr,
        new java.util.Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.equals(o2)) {
                    return 0;
                }
                else if (o1.charAt(0) > o2.charAt(0)) {
                    return -1;
                }
                else return 1;
            }// this code is sorting just on the basis of first char not whole string
        });
        System.out.println(arr.toString());
    }
}
