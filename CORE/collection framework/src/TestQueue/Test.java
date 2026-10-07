package TestQueue;

import java.util.LinkedList;
import java.util.Queue;

public class Test
{
    public static void main(String[] args)
    {
        //        Queue q2=new LinkedList(); old way no type safety
        Queue<Integer> q = new LinkedList<>();
        /// Add of element
        /// add throws exception if unable to insert due to some issue, whereas offer return false
        q.add(1);
        q.offer(2);
        System.out.println(q);
        // poll() return null if empty remove() throws error
        System.out.println(q.remove());
        System.out.println(q.remove());
//        System.out.println(q.poll());
        // peek vs element ---> element throw exception peek return null
        q.add(3);
        System.out.println(q.peek());
        q.offer(4);
        q.remove();
        System.out.println(q.element());

    }
}
