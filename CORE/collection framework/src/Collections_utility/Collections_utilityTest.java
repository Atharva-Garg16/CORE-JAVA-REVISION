package Collections_utility;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Collections_utilityTest {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("c");
        list.add("d");
        list.add("a");
        list.add("b");
        list.add("A");
        list.add("B");
        list.add("C");
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);
        Collections.sort(list);// sorts by unicode in string
        System.out.println(list);
        Collections.addAll(list, "al","blo","cop","dan","abcd");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        list.add("a");
        System.out.println(Collections.frequency(list, "a"));
        System.out.println(Collections.max(list));
        List<String> list2 = Collections.unmodifiableList(list);
        System.out.println(list2);
//        Collections.sort(list2);
        //throws an error
    }
}
