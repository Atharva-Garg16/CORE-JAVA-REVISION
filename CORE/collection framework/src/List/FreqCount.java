package List;

import Collections_utility.Collections_utilityTest;

import java.util.ArrayList;
import java.util.Collections;

public class FreqCount {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        Collections.addAll(a,1,2,5,2,4,3,1,2,5,2,4,3,1,2,5,2,4,3);
        System.out.println(Collections.frequency(a,2));
    }
}
