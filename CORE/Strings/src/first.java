public class first {
    /** Since Strings are immutable, modifying a copied String does not affect the original String. Any modification creates a new String object, unlike arrays where copying can create a reference to the same object.
     */
    public static void main(String[] args) {
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);//true as they have same reference
        String str3=new String("abc");//this creates String in heap not in String pool
        System.out.println(str3==str2);// false as new keyword allocate new memory in string pool
        System.out.println(str1.equals(str3));
        // this compares value
        /*Methods for String
        * .length() --> return length of String
        * .equals() --> check equality of two strings
        * .indexof() --> returns 1st occurrence index of substring or character we can also pass start and end as additional param
        * .substring(begin,end) --> end is not included
        * */
        int k=17; int m=12;
        System.out.printf("My age was %d ,3 years ago and %d ,8 years ago ",k,m);

        System.out.printf("\n%-15s\n",str2);// 15 length of string right align
        System.out.printf("%15s",str3);//15 LOS left align data
        System.out.println();
        System.out.printf("%S\n",str1);// Capital s capitalize
        System.out.println(str1.toUpperCase());




    }
}