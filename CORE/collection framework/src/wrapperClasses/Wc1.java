package wrapperClasses;

import java.util.Scanner;

public class Wc1 {
    static void main() {
        /**wrapper classes provides a way to declare primitive as object
         * Automatic conversion between primitive and integers
         * wrapper class objects are immutable
         * useful utility methods like compareTo() valueOf() parseXxx() e.g. parseInt()
         * It's needed for storing primitives in collection objects like ArrayList ,HashMap,etc
         * */
//        Integer k=new  Integer(5);//Unnecessary boxing 'Integer(int)' is deprecated since version 9
        Integer i=Integer.valueOf("66");// String to Integer class




        Integer a =1;// no need of new due to automatic conversion
        int b=a;
        b+=a;
        System.out.println(b);
        Integer c=7;
        System.out.println(a+c);// autoconversion
        Scanner sc=new Scanner(System.in);
        int p=sc.nextInt();
        System.out.println(a.equals(p));
        // we can also declare wrapper class object as null rather than keeping random values
        Integer aa=null;
        Integer bb=sc.nextInt();// we can also take i/p using same method
    }
}
