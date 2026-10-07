package Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class newSet
{
    public static void main(String[] args)

        {
//        Set set = new HashSet(); lack of type safety
            // unordered collection only single copy (Unique elements)
            Set<Integer> set = new HashSet<>();
            System.out.println(set.add(1));
            set.add(2);
            set.add(3);
            set.add(4);
            System.out.println(set.add(4));
            System.out.println(set);
            /// tree set type of set that maintains ordering
            set.remove(1);
            System.out.println(set);
            System.out.println(set.contains(3));
            System.out.println(set.remove(1));
            set.clear();
            System.out.println(set.isEmpty());

        }
}
