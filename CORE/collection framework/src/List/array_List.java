package List;


import java.util.ArrayList;
import java.util.List;


public class array_List
{
    static void main() {
        List <Integer> list=new ArrayList<>();
        // 1.adding element by default at last (value) , we can also specify as (index,value)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(1,4);
        System.out.println(list);
        // 2.removes value at specific index or specific object
        list.remove(1);
//        list.remove(4); as object can't use directly in case of Integer list
        list.remove(Integer.valueOf(4));


        System.out.println(list);
        list.add(4);
        //3. get(int index) get the value at particular index
        System.out.println(list.get(1));
        //4. set (index,value) replace the element at specified position
        list.set(2,100);
        // 5.size() --> return size of list
        System.out.println(list.size());
        // 6.contains ---> return boolean value either list contains object or not
        System.out.println(list.contains(40));
        System.out.println(list.contains(100));
        // indexof() --> first index of occurrence or -1 if missing
        System.out.println(list.indexOf(100));
        System.out.println(list.indexOf(34));
        list.clear();// clears the list

        System.out.println(list.isEmpty());

        // we also have method like addFirst,addLast,getFirst,getLast , lastIndexOf ,etc

    }

}
